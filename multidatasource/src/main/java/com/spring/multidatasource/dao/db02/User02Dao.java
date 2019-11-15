package com.spring.multidatasource.dao.db02;

import com.spring.multidatasource.base.BaseDao;
import com.spring.multidatasource.entity.db02.User02;
import com.spring.multidatasource.mapper.db02.User02Mapper;
import org.springframework.stereotype.Repository;

@Repository
public class User02Dao extends BaseDao<User02Mapper, User02Mapper, User02> {

    @Override
    protected void setMapperClass() {
        this.setMapperClass(User02Mapper.class);
        this.setExtMapperClass(User02Mapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(User02.class);
    }

    public User02 queryUserById(long userId){
        return this.getMapper().selectByPrimaryKey(userId);

    }
}
