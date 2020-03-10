package com.spring.multidatasource.controller;

import com.spring.multidatasource.dao.oma.AccountDao;
import com.spring.multidatasource.dto.AccountDto;
import com.spring.multidatasource.entity.oma.OmaAccount;
import com.spring.multidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("/saveAccount")
    public void saveAccount(){
        userServiceImpl.saveAccount();
    }

    @RequestMapping("/saveUser")
    public void saveUser(){
        List<OmaAccount> list = userServiceImpl.queryOmaAccountList();
        Map<String, AccountDto> map = new HashMap<>();
        for(OmaAccount account : list){
            AccountDto a = new AccountDto(account.getPhone(), account.getUnionId(), account.getUuid());
            map.put(account.getPhone(), a);
        }
        userServiceImpl.saveUser(list, map);
    }

}
