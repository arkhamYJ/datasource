package org.arkham.dynamic_datasource_framework.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.arkham.dynamic_datasource_framework.entity.User;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> list();

    @Insert("INSERT INTO  user(id,`name`) VALUES (#{id}, #{name})")
    void save(User friend);
}