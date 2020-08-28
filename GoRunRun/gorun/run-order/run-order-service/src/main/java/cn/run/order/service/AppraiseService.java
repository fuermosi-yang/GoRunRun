package cn.run.order.service;

import cn.run.order.mapper.AppraiseMapper;
import cn.run.order.mapper.OrderMapper;
import cn.run.order.mapper.UserMapper;
import cn.run.order.pojo.RunAppraise;
import cn.run.order.pojo.RunOrder;
import cn.run.order.pojo.RunUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseService {

    @Autowired
    private AppraiseMapper appraiseMapper;

    @Autowired
    private OrderMapper orderMapper;



    public List<RunAppraise> findAppraise(Long rid) {
        List<RunAppraise> list = appraiseMapper.selectByID(rid);
        return list ;
    }



    public void insertAppraise(RunAppraise runAppraise) {
//        RunUser runUser = userMapper.selectByPrimaryKey(runAppraise.getUid());
//        runAppraise.setAname(runUser.getUname());
        RunOrder runOrder = new RunOrder();
        runOrder.setRid(runAppraise.getRid());
        runOrder.setUid(runAppraise.getUid());
        List<RunOrder> select = orderMapper.select(runOrder);
        for (RunOrder order : select) {
            RunOrder runOrder1 = new RunOrder();
            runOrder1.setOid(order.getOid());
            runOrder1.setOstatus(5);
            orderMapper.updateByPrimaryKeySelective(runOrder1);
        }
        appraiseMapper.insertSelective(runAppraise);
    }

}
