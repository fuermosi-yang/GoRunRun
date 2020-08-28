package com.run.controller;

import com.run.pojo.RunOrder;
import com.run.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lianxi3")
public class OrderController {
    @Autowired
    private ManagerService managerService;

    @GetMapping("selectorder")
    public List<RunOrder> selectOrder(){
        return managerService.selectOrder();

    }
    @GetMapping("tongguoorder")
    public void tongGuoOrder(Long id){
        System.out.println(id);
            managerService.tongGuoOrder(id);


    }
    @PostMapping("jujueorder")
    public void juJueOrder(@RequestBody RunOrder runOrder){

        managerService.juJueOrder(runOrder);


    }

}
