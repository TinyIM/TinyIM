package com.kanri.tinyim.tinyim.mapper;

import com.kanri.tinyim.tinyim.pojo.UserPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE username = #{username}")
    UserPojo select(String username);
}
