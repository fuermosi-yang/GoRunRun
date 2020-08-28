package cn.run.order.controller;

import cn.run.order.pojo.RunOrder;
import cn.run.order.pojo.RunReceiver;
import cn.run.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//订单
@RequestMapping("order")
@RestController
public class OrderController {
    //自动注入orderservice
    @Autowired
    private OrderService orderService;

    //查询所有订单
    @GetMapping("findOrder")
    public ResponseEntity<List<RunOrder>> findOrder(){
        List<RunOrder> list= orderService.findOrder();
        return ResponseEntity.ok(list);
    }
    @GetMapping("uid/{uid}")
    public ResponseEntity<List<RunOrder>> queryByUser(@PathVariable("uid") Long uid){
        List<RunOrder> list = orderService.queryByUser(uid);
        return ResponseEntity.ok(list);
    }
    //添加订单
    @PostMapping("insertOrder")
    public ResponseEntity<Void> insertOrder(@RequestBody RunOrder runOrder ){
        orderService.insertReceiver(runOrder);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    //根据oid查询订单
    @GetMapping("oid/{oid}")
    public ResponseEntity<List<RunOrder>> queryByOrder(@PathVariable("oid") Long oid){
        List<RunOrder> list = orderService.queryByReceiver(oid);
        return ResponseEntity.ok(list);
    }
    @GetMapping("rid/{rid}")
    public ResponseEntity<List<RunOrder>> queryr(@PathVariable("rid") Long rid){
        List<RunOrder> list = orderService.queryr(rid);
        return ResponseEntity.ok(list);
    }
    //修改订单
    @PutMapping("updateOrder")
    public ResponseEntity<Void> updateOrder(@RequestBody RunOrder runOrder){
        System.err.println(runOrder.getRid());
        orderService.updateReceiver(runOrder);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping("updOstatus")
    public ResponseEntity<Void> updOstatus(@RequestBody RunOrder runOrder){
        orderService.updOstatus(runOrder);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping("updOstatus2")
    public ResponseEntity<Void> updOstatus2(@RequestBody RunOrder runOrder){
        orderService.updOstatus2(runOrder);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping("updOstatus3")
    public ResponseEntity<Void> updOstatus3(@RequestBody RunOrder runOrder){
        orderService.updOstatus3(runOrder);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping("updOstatus4")
    public ResponseEntity<Void> updOstatus4(@RequestBody RunOrder runOrder){
        orderService.updOstatus4(runOrder);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
