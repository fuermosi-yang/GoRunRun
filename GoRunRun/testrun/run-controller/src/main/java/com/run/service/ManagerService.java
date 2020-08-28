package com.run.service;

import com.run.dao.ManagerMapper;
import com.run.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerMapper managerMapper;
    public List<Manager> selectmanager(){


        return managerMapper.selectmanager();
    }

    public Manager jiaoYanManager(Manager manager){

        return managerMapper.jiaoYanManager(manager);

    }
    public Count count(){

        int i = managerMapper.selectReceiverCount();
        int i1 = managerMapper.selectUserCount();
        Count count=new Count();
        count.setUsercount(i1);
        count.setReceivercount(i);
        return count;
    }
    public Count orderCount(){
        int i1 = managerMapper.selectOrderCount1();
        int i2 = managerMapper.selectOrderCount2();
        int i3 = managerMapper.selectOrderCount3();
        int i4 = managerMapper.selectOrderCount4();
        int i5 = managerMapper.selectOrderCount5();
        int i6 = managerMapper.selectOrderCount6();
        Count count=new Count();
        count.setOrdercount1(i1);
        count.setOrdercount2(i2);
        count.setOrdercount3(i3);
        count.setOrdercount4(i4);
        count.setOrdercount5(i5);
        count.setOrdercount6(i6);
        return count;




    }
    public List<RunUser> selectRunUser(RunUser runUser){
        List<RunUser> runUsers = managerMapper.selectRunUser(runUser);

        List<RunUser> runUsers2 = managerMapper.selectRunUser(runUser);
        return runUsers;


    }

    public void jieJinUser(Long id){
        managerMapper.jieJinUser(id);


    }
    public void jinYongUser(Long id){
        managerMapper.jinYongUser(id);

    }
    public void shanChuUser(Long id){

        managerMapper.shanChuUser(id);
    }
    public void jieJinReceiver(Long id){
        managerMapper.jieJinReceiver(id);


    }
    public void jinYongReceiver(Long id){
        managerMapper.jinYongReceiver(id);

    }
    public void shanChuReceiver(Long id){

        managerMapper.shanChuReceiver(id);
    }
    public List<RunUser> souSuoUser(RunUser runUser){

        return   managerMapper.souSuoUser(runUser);

    }
    public List<RunReceiver> selectRunReceiver(){
        return managerMapper.selectRunReceiver();

    }
    public List<RunReceiver> souSuoReceiver(RunUser runUser){

        return managerMapper.souSuoReceiver(runUser);
    }
    public List<RunOrder> selectOrder(){
        return managerMapper.selectOrder();
    }
    public void tongGuoOrder(Long id){

        managerMapper.tongGuoOrder(id);
    }
    public void juJueOrder(RunOrder runOrder){
        managerMapper.juJueOrder(runOrder);



    }

    public List<RunAppraise> selectAppraise(){
        return managerMapper.selectAppraise();
    }
    public void tongGuoAppraise(Long id){
        managerMapper.tongGuoAppraise(id);

    }


    public void juJueAppraise(RunOrder order){

        managerMapper.juJueAppraise(order);


    }
    public List<Statistics> statistics(){
        return managerMapper.statistics();

    }

    public List<Statistics> statisticsOrder(){
        return managerMapper.statisticsOrder();
    }
}
