package com.spring.multidatasource.controller;

import com.spring.multidatasource.dao.db01.User01Dao;
import com.spring.multidatasource.dao.db02.User02Dao;
import com.spring.multidatasource.entity.db01.User;
import com.spring.multidatasource.entity.db02.User02;
import com.spring.multidatasource.service.UserService;
import com.spring.multidatasource.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/db01")
    public String testDb01(){
        User u = userServiceImpl.queryUserById(1L);
        System.out.println(JsonUtil.toJsonString(u));
        return JsonUtil.toJsonString(u);
    }

    @RequestMapping("/db02")
    public String testDb02(){
        User02 u = userServiceImpl.queryUser02ById(1L);
        System.out.println(JsonUtil.toJsonString(u));
        return JsonUtil.toJsonString(u);
    }

}
