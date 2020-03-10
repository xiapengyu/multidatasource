package com.spring.multidatasource.service;

import com.spring.multidatasource.dto.AccountDto;
import com.spring.multidatasource.entity.cha.UserInfoOverview;
import com.spring.multidatasource.entity.oma.OmaAccount;

import java.util.List;
import java.util.Map;

public interface UserService {

    public void saveAccount();

    public void saveUser(List<OmaAccount> list, Map<String, AccountDto> map);

    public OmaAccount queryByPhone(String phone);

    public List<UserInfoOverview> queryUserList();

    public List<OmaAccount> queryOmaAccountList();
}
