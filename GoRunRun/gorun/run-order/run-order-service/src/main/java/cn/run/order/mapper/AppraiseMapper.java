package cn.run.order.mapper;

import cn.run.order.pojo.RunAppraise;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
@org.apache.ibatis.annotations.Mapper
public interface AppraiseMapper extends Mapper<RunAppraise> {
    @Select("select * from run_appraise where rid=#{rid}")
    List<RunAppraise> selectByID(Long id);
}
