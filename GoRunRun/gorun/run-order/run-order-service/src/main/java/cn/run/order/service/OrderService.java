package cn.run.order.service;

import cn.run.order.mapper.OrderMapper;
import cn.run.order.mapper.UserMapper;
import cn.run.order.pojo.RunOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;


    //查询所有订单(根据审核状态和订单状态查询)
    public List<RunOrder> findOrder() {
        RunOrder runOrder = new RunOrder();
        runOrder.setOstatus(1);
        runOrder.setShenheorder((long) 1);
        return orderMapper.select(runOrder);
    }
    //添加订单
    public void insertReceiver(RunOrder runOrder) {
        runOrder.setCreatetime(new Date());
        orderMapper.insertSelective(runOrder);
    }
    //修改订单
    public void updateReceiver(RunOrder runOrder) {
        orderMapper.updateByPrimaryKey(runOrder);
    }
    //根据oid查询订单
    public List<RunOrder> queryByReceiver(Long oid) {
        RunOrder runOrder = new RunOrder();
        runOrder.setOid(oid);
        return orderMapper.select(runOrder);
    }
    //根据oid查询订单
    public List<RunOrder> queryr(Long rid) {
        RunOrder runOrder = new RunOrder();
        runOrder.setRid(rid);
        return orderMapper.select(runOrder);
    }
    public void updOstatus(RunOrder runOrder) {
        runOrder.setOstatus(2);
        orderMapper.updateByPrimaryKey(runOrder);
    }



    public List<RunOrder> queryByUser(Long uid) {
        RunOrder runOrder = new RunOrder();
        runOrder.setUid(uid);
        return   orderMapper.select(runOrder);
    }

    public void updOstatus2(RunOrder runOrder) {
        runOrder.setOstatus(3);
        orderMapper.updateByPrimaryKey(runOrder);
    }

    public void updOstatus3(RunOrder runOrder) {
        runOrder.setOstatus(4);
        orderMapper.updateByPrimaryKey(runOrder);
    }

    public void updOstatus4(RunOrder runOrder) {
        runOrder.setOstatus(5);
        orderMapper.updateByPrimaryKey(runOrder);
    }
}
