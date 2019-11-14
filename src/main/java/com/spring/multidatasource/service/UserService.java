package com.spring.multidatasource.service;

import com.spring.multidatasource.entity.db01.User;
import com.spring.multidatasource.entity.db02.User02;

public interface UserService {

    public User queryUserById(long id);

    public User02 queryUser02ById(long id);
}
