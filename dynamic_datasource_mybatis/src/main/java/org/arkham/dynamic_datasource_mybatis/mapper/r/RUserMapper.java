package org.arkham.dynamic_datasource_mybatis.mapper.r;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.arkham.dynamic_datasource_mybatis.entity.User;

import java.util.List;

/**
 * @Auther: wangyi
 * @Date: 2020/12/12 01:16
 * @Description: 
 */
public interface RUserMapper {
    @Select("SELECT * FROM user")
    List<User> list();

    @Insert("INSERT INTO  user(id,`name`) VALUES (#{id},#{name})")
    void save(User friend);
}