package com.run.controller;

import com.run.pojo.Statistics;
import com.run.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("lianxi5")
public class StatisticController {

    @Autowired
    private ManagerService managerService;
    @GetMapping("statisticsuser7")
    public List<Statistics> statisticsUser7(){
        List<Statistics> statistics = managerService.statistics();

        List<Statistics> count=new ArrayList<>();

        for(int i=statistics.size()-7;i<statistics.size();i++){

            count.add(statistics.get(i));


        }
        return count;







    }
    @GetMapping("statisticsuser30")
    public List<Statistics> statisticsUser30(){
        List<Statistics> statistics = managerService.statistics();

        List<Statistics> count=new ArrayList<>();

        for(int i=statistics.size()-30;i<statistics.size();i++){

            count.add(statistics.get(i));


        }
        return count;







    }

    @GetMapping("statisticsorder7")
    public List<Statistics>  statisticsOrder7(){
        List<Statistics> statistics = managerService.statisticsOrder();
        List<Statistics> count=new ArrayList<>();

        for(int i=statistics.size()-7;i<statistics.size();i++){

            count.add(statistics.get(i));


        }
        return count;




    }
    @GetMapping("statisticsorder30")
    public List<Statistics> statisticsOrder30(){
        List<Statistics> statistics =managerService.statisticsOrder();

        List<Statistics> count=new ArrayList<>();

        for(int i=statistics.size()-30;i<statistics.size();i++){

            count.add(statistics.get(i));


        }
        return count;







    }



}
