package com.run.controller;

import com.run.pojo.RunAppraise;
import com.run.pojo.RunOrder;
import com.run.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lianxi4")
public class AppraiseController {

    @Autowired
    private ManagerService managerService;

    @GetMapping("selectorder")
    public List<RunAppraise> selectAppraise(){
        return managerService.selectAppraise();

    }
    @GetMapping("tongguoorder")
    public void tongGuoOrder(Long id){
        managerService.tongGuoAppraise(id);



    }
    @PostMapping("jujueorder")
    public void juJueOrder(@RequestBody RunOrder runOrder){
        managerService.juJueAppraise(runOrder);


    }

}
