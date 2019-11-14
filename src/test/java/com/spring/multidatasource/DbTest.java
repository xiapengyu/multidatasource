package com.spring.multidatasource;

import com.spring.multidatasource.dao.db01.User01Dao;
import com.spring.multidatasource.dao.db02.User02Dao;
import com.spring.multidatasource.entity.db01.User;
import com.spring.multidatasource.entity.db02.User02;
import com.spring.multidatasource.util.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MultidatasourceApplication.class})
public class DbTest {

    @Autowired
    User01Dao user01Dao;

    @Autowired
    User02Dao user02Dao;

    @Test
    public void testQueryUser01(){
        User user01 = user01Dao.queryUserById(1L);
        System.out.println(JsonUtil.toJsonString(user01));
    }

    @Test
    public void testQueryUser02(){
        User02 user02 = user02Dao.queryUserById(1L);
        System.out.println(JsonUtil.toJsonString(user02));
    }

}
