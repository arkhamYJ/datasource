package org.arkham.dynamic_datasource_framework.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.arkham.dynamic_datasource_framework.entity.User;
import org.arkham.dynamic_datasource_framework.mapper.UserMapper;
import org.arkham.dynamic_datasource_framework.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplService implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @DS("master")
    public void save(User user) {
        userMapper.save(user);
    }
    @Override
    @DS("slave_1")  // 从库， 如果按照下划线命名方式配置多个  ， 可以指定前缀即可（组名）
    public List<User> list() {
        return userMapper.list();
    }
}
