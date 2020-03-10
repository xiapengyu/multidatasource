package com.spring.multidatasource.mapper.cha;

import com.spring.multidatasource.entity.cha.UserInfoOverview;
import com.spring.multidatasource.entity.cha.UserInfoOverviewCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface UserInfoOverviewMapper {
    int countByExample(UserInfoOverviewCriteria example);

    int deleteByExample(UserInfoOverviewCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoOverview record);

    int insertSelective(UserInfoOverview record);

    List<UserInfoOverview> selectByExampleWithRowbounds(UserInfoOverviewCriteria example, RowBounds rowBounds);

    List<UserInfoOverview> selectByExample(UserInfoOverviewCriteria example);

    UserInfoOverview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInfoOverview record, @Param("example") UserInfoOverviewCriteria example);

    int updateByExample(@Param("record") UserInfoOverview record, @Param("example") UserInfoOverviewCriteria example);

    int updateByPrimaryKeySelective(UserInfoOverview record);

    int updateByPrimaryKey(UserInfoOverview record);
}