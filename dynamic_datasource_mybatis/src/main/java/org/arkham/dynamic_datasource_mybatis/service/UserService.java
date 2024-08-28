package org.arkham.dynamic_datasource_mybatis.service;


import org.arkham.dynamic_datasource_mybatis.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();

    // 保存-- 写库
    void saveW(User friend);

    // 保存-- 读库
    void saveR(User friend);

    void save(User friend);

    // 读-- 写库
//    void saveAll(Friend friend) throws Exception;
//
//    void saveAllR(Friend friend);
}
