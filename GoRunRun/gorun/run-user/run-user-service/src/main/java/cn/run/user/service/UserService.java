package cn.run.user.service;

import cn.run.common.util.NumberUtils;
import cn.run.user.mapper.UserMapper;
import cn.run.user.pojo.RunUser;
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
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //查询所有
    public List<RunUser> findUser() {
        return userMapper.selectAll();
    }


    //添加用户
    public void insertUser(RunUser runUser) {
        runUser.setUcreatetime(new Date());
        runUser.setUid((long) 2);
        userMapper.insertSelective(runUser);
    }


    //修改用户
    public void updateUser(RunUser runUser) {
        userMapper.updateByPrimaryKey(runUser);
    }


    //根据uid查询普通用户
    public List<RunUser> queryByUser(Long uid) {

        RunUser runUser = new RunUser();
        runUser.setUid(uid);
        return userMapper.select(runUser);
    }

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public Boolean gotocode(String phone) {
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
            amqpTemplate.convertAndSend("run.sms.exchange", "sms.verity.code", map);
            System.out.println("发送成功了");
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    public RunUser tologin(RunUser runUser) {
        RunUser runuser2 = userMapper.selectUser(runUser);
        //帐号状态，，0就是禁用，不能登录了
        if (runuser2.getStatus() == 0) {
            return null;
        }
        //radis中根据手机号取出验证码
        String oldCode = redisTemplate.opsForValue().get(runUser.getUphone());
        if (((oldCode.equals(runUser.getCode()))) || (runuser2 != null)) {
            return runuser2;
        }
        return null;
    }
}
