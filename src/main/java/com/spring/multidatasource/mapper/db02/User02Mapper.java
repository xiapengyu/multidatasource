package com.spring.multidatasource.mapper.db02;

import com.spring.multidatasource.entity.db02.User02;
import com.spring.multidatasource.entity.db02.User02Criteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface User02Mapper {
    long countByExample(User02Criteria example);

    int deleteByExample(User02Criteria example);

    int deleteByPrimaryKey(Long userId);

    int insert(User02 record);

    int insertSelective(User02 record);

    List<User02> selectByExampleWithRowbounds(User02Criteria example, RowBounds rowBounds);

    List<User02> selectByExample(User02Criteria example);

    User02 selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") User02 record, @Param("example") User02Criteria example);

    int updateByExample(@Param("record") User02 record, @Param("example") User02Criteria example);

    int updateByPrimaryKeySelective(User02 record);

    int updateByPrimaryKey(User02 record);
}