package cn.run.user.service;

import cn.run.common.util.NumberUtils;
import cn.run.user.mapper.ReceiverMapper;
import cn.run.user.pojo.RunReceiver;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;


@Service
public class ReceiverService {
    @Autowired
    private ReceiverMapper receiverMapper;
    //查询所有接单员
    public List<RunReceiver> findReceiver() {
      return   receiverMapper.selectAll();
    }
    //添加接单员
    public void insertReceiver(RunReceiver runReceiver) {
        runReceiver.setRcreatetime(new Date());

        receiverMapper.insertSelective(runReceiver);
    }
    //修改接单员信息
    public void updateReceiver(RunReceiver runReceiver) {
        runReceiver.setRcreatetime(new Date());
        receiverMapper.updateByPrimaryKey(runReceiver);
    }
    //根据rid查询接单员信息
    public List<RunReceiver> queryByReceiver(Long rid) {
        RunReceiver runReceiver = new RunReceiver();
        runReceiver.setRid(rid);
        return    receiverMapper.select(runReceiver);
    }
    //注册
    public void toreceiverRegist(RunReceiver runReceiver) {
        runReceiver.setRcreatetime(new Date());
        runReceiver.setRid((long) 3);
        receiverMapper.insertSelective(runReceiver);
    }

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public Boolean gotocode1(String phone) {
        Boolean flag = true;
        try {
            //验证码生成
            String code = NumberUtils.generateCode(6);
            //存入redis 设置时间
            redisTemplate.opsForValue().set(phone, code, 15, TimeUnit.MINUTES);
            //发送 微服务 发送短信 发送结构为map
            Map<String, String> map = new ConcurrentHashMap<>();
            map.put("phone", phone);
            map.put("code", code);
            //调用方法发送到mq
            amqpTemplate.convertAndSend("run.sms.exchange", "sms.verity.code",map);
            System.out.println("发送成功了");
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public RunReceiver tologin(RunReceiver runReceiver) {
        RunReceiver runReceiver1 = receiverMapper.selectReceiver(runReceiver);
        //帐号状态，，0就是禁用，不能登录了
        if(runReceiver1.getStatus()==0){
            return null;
        }
        //radis中根据手机号取出验证码
        String oldCode = redisTemplate.opsForValue().get(runReceiver.getPhone());

        if (((oldCode.equals(runReceiver.getCode())))||(runReceiver1!=null)){
            return runReceiver1;
        }
        return null;
    }

}
