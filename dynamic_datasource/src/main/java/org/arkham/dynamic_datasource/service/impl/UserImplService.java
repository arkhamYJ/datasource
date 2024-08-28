package org.arkham.dynamic_datasource.service.impl;

import org.arkham.dynamic_datasource.annotation.WR;
import org.arkham.dynamic_datasource.entity.User;
import org.arkham.dynamic_datasource.mapper.UserMapper;
import org.arkham.dynamic_datasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplService implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    @WR("R")        // 库2
    public List<User> list() {
//        DynamicDataSource.name.set("R");
        return userMapper.list();
    }

    @Override
    @WR("W")        // 库1
    public void save(User friend) {
//        DynamicDataSource.name.set("W");
        userMapper.save(friend);
    }

}
