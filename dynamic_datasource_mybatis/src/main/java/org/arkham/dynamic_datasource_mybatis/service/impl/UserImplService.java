package org.arkham.dynamic_datasource_mybatis.service.impl;


import org.arkham.dynamic_datasource_mybatis.entity.User;
import org.arkham.dynamic_datasource_mybatis.mapper.r.RUserMapper;
import org.arkham.dynamic_datasource_mybatis.mapper.w.WUserMapper;
import org.arkham.dynamic_datasource_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class UserImplService implements UserService {

    @Autowired
    private RUserMapper rFriendMapper;

    @Autowired
    private WUserMapper wFriendMapper;

    @Autowired
    TransactionTemplate wTransactionTemplate;
    @Autowired
    TransactionTemplate rTransactionTemplate;


    // 读-- 读库
    @Override
    public List<User> list() {
        return rFriendMapper.list();
    }

    // 保存-- 写库
    @Override
    public void save(User user) {
        wFriendMapper.save(user);
    }


    // 保存-- 写库
    @Override
    public void saveW(User user) {
        user.setName("xman11");
        wFriendMapper.save(user);
    }

    // 保存-- 读库
    @Override
    public void saveR(User user) {
        user.setName("xman");
        rFriendMapper.save(user);
    }
}
