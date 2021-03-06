package cn.run.order.mapper;

import cn.run.order.pojo.RunUser;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<RunUser> {
    @Select("select * from run_user where username=#{username} and password=#{password}")
    RunUser selectUser(RunUser runUser);
}
