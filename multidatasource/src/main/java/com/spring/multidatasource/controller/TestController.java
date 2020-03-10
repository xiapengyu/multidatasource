package com.spring.multidatasource.controller;

import com.spring.multidatasource.entity.cha.UserInfoOverview;
import com.spring.multidatasource.entity.oma.OmaAccount;
import com.spring.multidatasource.service.UserService;
import com.spring.multidatasource.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping(value = "/queryUserList", method = RequestMethod.POST)
    public String queryUserList() {
        List<UserInfoOverview> list = userServiceImpl.queryUserList();
        logger.info("返回结果:{}", JsonUtil.toJsonString(list.subList(0, 5)));
        return "hello";
    }

    @RequestMapping(value = "/queryAccountList", method = RequestMethod.POST)
    public String queryAccountList() {
        List<OmaAccount> list = userServiceImpl.queryOmaAccountList();
        logger.info("返回结果:{}", JsonUtil.toJsonString(list.subList(0, 5)));
        return "hello";
    }

}
