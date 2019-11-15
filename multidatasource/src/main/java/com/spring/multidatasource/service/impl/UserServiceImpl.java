package com.spring.multidatasource.service.impl;

import com.spring.multidatasource.aspect.TargetDataSource;
import com.spring.multidatasource.common.DataSourceKey;
import com.spring.multidatasource.dao.db01.User01Dao;
import com.spring.multidatasource.dao.db02.User02Dao;
import com.spring.multidatasource.entity.db01.User;
import com.spring.multidatasource.entity.db02.User02;
import com.spring.multidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    User01Dao user01Dao;

    @Autowired
    User02Dao user02Dao;

    @TargetDataSource(dataSourceKey = DataSourceKey.db01)
    @Override
    public User queryUserById(long id) {
        return user01Dao.queryUserById(id);
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.db02)
    @Override
    public User02 queryUser02ById(long id) {
        return user02Dao.queryUserById(id);
    }
}
