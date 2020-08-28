package com.run.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.run.pojo.Count;
import com.run.pojo.Manager;
import com.run.pojo.RunUser;
import com.run.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("lianxi")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("selectmanager")
    public Manager selectManager(@RequestBody Manager manager){

        Manager m = managerService.jiaoYanManager(manager);
        if(m!=null){
            return new Manager(null,"可以的",null);


        }else {
            return new Manager(null,"不可以的",null);

        }

    }
    @GetMapping("count")
    public Count count(){
        Count count = managerService.count();

        return count;
    }
    @GetMapping("ordercount")
    public Count orderCount(){
        Count count = managerService.orderCount();
        return count;

    }
    @PostMapping("selectuser")
    public List<RunUser> selectRunUser(@RequestBody RunUser runuser){
        /*if(runuser.getPageNum()==null){
            Page page = PageHelper.startPage(1, 1);
            List<RunUser> runUsers = managerService.selectRunUser(runuser);
            PageInfo<RunUser> pageInfo=new PageInfo<>(runUsers);
            System.out.println(pageInfo);
            return pageInfo;

        }
        return null;*/
        List<RunUser> runUsers1 = managerService.selectRunUser(runuser);
        List<RunUser> runUsers=new ArrayList<>();



        if(runuser.getPageNum()==null){
           runuser.setPageNum(1);
        }


        int pageSize=2;
       int lastPage1= runUsers1.size()/pageSize;
        int lastPage=runUsers1.size()%pageSize==0?lastPage1:lastPage1+1;
        for(int i=0;i<runUsers1.size();i++){
            runUsers1.get(i).setLastPage(lastPage);
            if(runuser.getPageNum()==null){
                runUsers1.get(i).setPageNum(1);


            }else{
                runUsers1.get(i).setPageNum(runuser.getPageNum());
            }

        }

        runuser.setLastPage(lastPage);
        if(runuser.getPageNum()==1){
            for (int i = 0; i < pageSize; i++) {
                runUsers.add(runUsers1.get(i));


            }
            return runUsers;

        }else {
            if((runuser.getPageNum())*pageSize<=runUsers1.size()){
                for (int i = (runuser.getPageNum()-1)*pageSize; i < runuser.getPageNum()*pageSize; i++) {
                    runUsers.add(runUsers1.get(i));


                }




            }else{
                for (int i = (runuser.getPageNum()-1)*pageSize; i < runUsers1.size(); i++) {
                    runUsers.add(runUsers1.get(i));


                }


            }
                return runUsers;



        }




    }
    //解封
    @GetMapping("jiejinuser")
    public void jiaJinUser(Long id){
        managerService.jieJinUser(id);


    }
    //禁用
    @GetMapping("jinyonguser")
    public void jinYongUser(Long id){
        managerService.jinYongUser(id);


    }
    //删除
    @GetMapping("shanchuuser")
    public void shanChuUser(Long id){
        managerService.shanChuUser(id);

    }
    //搜索
    @PostMapping("sousuouser")
    public List<RunUser>  souSuoUser(@RequestBody  RunUser runUser){
        System.out.println(runUser.getUname());
        System.out.println(managerService.souSuoUser(runUser));
        return managerService.souSuoUser(runUser);



    }


}
