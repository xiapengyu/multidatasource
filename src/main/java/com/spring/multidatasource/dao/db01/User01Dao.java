package com.spring.multidatasource.dao.db01;

import com.spring.multidatasource.base.BaseDao;
import com.spring.multidatasource.entity.db01.User;
import com.spring.multidatasource.mapper.db01.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class User01Dao extends BaseDao<UserMapper, UserMapper, User> {

    @Override
    protected void setMapperClass() {
        this.setMapperClass(UserMapper.class);
        this.setExtMapperClass(UserMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(User.class);
    }

    public User queryUserById(long userId){
        return this.getMapper().selectByPrimaryKey(userId);
    }
}
