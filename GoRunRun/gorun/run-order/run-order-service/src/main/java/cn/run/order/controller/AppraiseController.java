package cn.run.order.controller;

import cn.run.order.pojo.RunAppraise;
import cn.run.order.pojo.RunOrder;
import cn.run.order.pojo.RunUser;
import cn.run.order.service.AppraiseService;
import cn.run.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("appraise")
public class AppraiseController {

    @Autowired
    private AppraiseService appraiseService;
    @Autowired
    private OrderService orderService;


    //查询所有评价(根据接单员的id获取评价)
    @GetMapping("findAppraise")
    public ResponseEntity<List<RunAppraise>> findAppraise(@RequestParam("rid") Long rid){
        List<RunAppraise> list= appraiseService.findAppraise(rid);
        return ResponseEntity.ok(list);
    }




    //添加评价
    @PostMapping("insertAppraise")
    public ResponseEntity<Void> insertUser(@RequestBody RunAppraise runAppraise){
        appraiseService.insertAppraise(runAppraise);


        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}
