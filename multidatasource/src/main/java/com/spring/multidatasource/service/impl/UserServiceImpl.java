package com.spring.multidatasource.service.impl;

import com.spring.multidatasource.aspect.TargetDataSource;
import com.spring.multidatasource.common.DataSourceKey;
import com.spring.multidatasource.dao.cha.UserInfoDao;
import com.spring.multidatasource.dao.oma.AccountDao;
import com.spring.multidatasource.dto.AccountDto;
import com.spring.multidatasource.entity.cha.UserInfoOverview;
import com.spring.multidatasource.entity.oma.OmaAccount;
import com.spring.multidatasource.service.UserService;
import com.spring.multidatasource.util.HttpUtil;
import com.spring.multidatasource.util.JsonUtil;
import com.spring.multidatasource.util.StrUtils;
import com.spring.multidatasource.util.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public UserInfoDao userInfoDao;

    @Autowired
    public AccountDao accountDao;

    @Value("${usercenter.appId}")
    public String appId = "";
    @Value("${usercenter.appKey}")
    public String appKey = "";
    @Value("${usercenter.url}")
    public String userCenterUrl = "";

    @TargetDataSource(dataSourceKey = DataSourceKey.oma)
    @Override
    public void saveAccount() {
        long from = 10000201011L;
        long to = 10000201060L;
        for (long i = from; i <= to; i++) {
            OmaAccount account = new OmaAccount();
            account.setUuid(UUIDUtil.getUUID());
            account.setPhone(i + "");
            account.setPassword("");
            account.setName("");
            account.setSex("");
            account.setFacePic("");
            account.setLastLoginTime(new Date());
            account.setCreateTime(new Date());
            account.setUpdateTime(new Date());
            account.setCreateUser(i + "");
            account.setUpdateUser(i + "");
            account.setDeleteFlag((short) 1);
            account.setIdenType("");
            account.setIdenNum("");
            account.setUnionId(queryAccountUnionId(i + ""));
            if (!account.getUnionId().equals("")) {
                accountDao.saveAccount(account);
            }
        }
    }


    private String queryAccountUnionId(String phone) {
        String unionId = "";
        try {
            Map<String, String> paramMap = new HashMap<>();
            paramMap.put("country", "+086");
            paramMap.put("phone", phone);
            String body = JsonUtil.toJsonString(paramMap);
            String sigUrl = StrUtils.generateSigUrl(null, null, body, appId, appKey);
            String postUrl = userCenterUrl + "?" + sigUrl;
            logger.info("用户>>>[{}], 参数>>>[{}], 请求地址>>>[{}]", phone, body, postUrl);
            String result = HttpUtil.httpsRequest(postUrl, "POST", body);
            logger.info("用户>>>[{}], 返回结果>>>[{}]", phone, JsonUtil.toJsonString(result));

            Map<String, Object> resultMap = JsonUtil.toMap(result);
            if (StrUtils.obj2String(resultMap.get("code")).equals("0")) {
                unionId = JsonUtil.toMap(JsonUtil.toJson(resultMap.get("result"))).get("union_id").toString();
                System.out.println("phone: " + phone + ", unionId: " + unionId);
            } else {
                System.out.println("统一用户中心未查到用户信息: " + phone);
            }
        } catch (Exception e) {
            System.out.println("查找同一用户中心失败: " + phone);
            return "";
        }
        return unionId;
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.cha)
    @Override
    public void saveUser(List<OmaAccount> list, Map<String, AccountDto> map) {
        long from = 10000201011L;
        long to = 10000201060L;
        for (long i = from; i <= to; i++) {
            AccountDto account = map.get(i + "");
            UserInfoOverview userInfo = new UserInfoOverview();
            userInfo.setAllConsumeAmount(new BigDecimal(0));
            userInfo.setAllConsumeNum(0);
            userInfo.setAllRechargeAmount(new BigDecimal(0));

            Map<String, String> resultMap = StrUtils.rechargeTool(account.getUuid(), 10000);
            if (resultMap == null) {
                continue;
            }
            userInfo.setBalance(new BigDecimal(10000));
            userInfo.setCreateTime(new Date());
            userInfo.setCreateUser(i + "");
            userInfo.setDeleteFlag((short) 1);
            userInfo.setAllElectricityKwh(new BigDecimal(0));
            userInfo.setPhone(i + "");
            userInfo.setUserUuid(resultMap.get("userUuid"));
            userInfo.setTotalChargingTime(0L);
            userInfo.setUpdateTime(new Date());
            userInfo.setUpdateUser(i + "");
            userInfo.setSign(resultMap.get("sign"));
            userInfo.setNickName(i + "");
            userInfo.setAvatarUrl("");
            userInfo.setActivityLockingAmount(BigDecimal.ZERO);
            userInfo.setChannelLockingAmount(BigDecimal.ZERO);
            userInfo.setUnionId(account.getUnionId());
            userInfo.setIsSync((short) 0);
            userInfoDao.saveUser(userInfo);
        }
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.cha)
    @Override
    public OmaAccount queryByPhone(String phone) {
        return accountDao.queryByPhone(phone);
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.cha)
    @Override
    public List<UserInfoOverview> queryUserList() {
        return userInfoDao.queryList();
    }

    @TargetDataSource(dataSourceKey = DataSourceKey.oma)
    @Override
    public List<OmaAccount> queryOmaAccountList() {
        return accountDao.queryList();
    }
}
