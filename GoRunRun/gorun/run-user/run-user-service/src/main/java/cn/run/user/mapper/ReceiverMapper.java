package cn.run.user.mapper;

import cn.run.user.pojo.RunReceiver;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface ReceiverMapper extends Mapper<RunReceiver> {
    @Select("select * from run_receiver where rusername=#{rusername} and rpassword=#{rpassword}")
    RunReceiver selectReceiver(RunReceiver runReceiver);
}
