package com.run.dao;

import com.run.pojo.*;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ManagerMapper extends Mapper<Manager> {

    public List<Manager> selectmanager();

    public Manager jiaoYanManager(Manager manager);

    public int selectUserCount();
    public int selectReceiverCount();
    public int selectOrderCount1();
    public int selectOrderCount2();
    public int selectOrderCount3();
    public int selectOrderCount4();
    public int selectOrderCount5();
    public int selectOrderCount6();

    public List<RunUser> selectRunUser(RunUser runUser);

    public void jieJinUser(Long id);

    public void jinYongUser(Long id);

    public void shanChuUser(Long id);
    public void jieJinReceiver(Long id);

    public void jinYongReceiver(Long id);

    public void shanChuReceiver(Long id);

    public List<RunUser> souSuoUser(RunUser runUser);

    public List<RunReceiver> selectRunReceiver();

    public List<RunReceiver> souSuoReceiver(RunUser runUser);

    @Select("select run_order.*,run_user.uname as username from run_order,run_user where run_order.uid=run_user.uid and run_order.shenheorder=0")
    public List<RunOrder> selectOrder();
    @Update("update run_order set shenheorder=1 where oid=#{id}")
    public void tongGuoOrder(Long id);
    @Update("update run_order set shenheorder=2,reason=#{reason} where oid=#{oid}")
    public void juJueOrder(RunOrder runOrder);
    @Select("select run_appraise.*,run_user.uname as username from run_appraise,run_user where run_appraise.uid=run_user.uid and run_appraise.status=0")
    public List<RunAppraise> selectAppraise();
    @Update("update run_appraise set status=1 where appraiseid=#{id}")
    public void tongGuoAppraise(Long id);
    @Update("update run_appraise set status=2,reason=#{reason} where appraiseid=#{oid}")
    public void juJueAppraise(RunOrder runOrder);

    @Select("select ucreatetime as createtime,count(uid) as count from run_user group by ucreatetime order by ucreatetime")
    public List<Statistics> statistics();
    @Select("SELECT createtime,COUNT(oid) as count FROM run_order GROUP BY createtime ORDER BY createtime")
    public List<Statistics> statisticsOrder();



}
