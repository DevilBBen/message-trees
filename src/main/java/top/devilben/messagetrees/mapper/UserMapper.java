package top.devilben.messagetrees.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.devilben.messagetrees.pojo.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
