package com.spring.multidatasource.mapper.oma;

import com.spring.multidatasource.entity.oma.OmaAccount;
import com.spring.multidatasource.entity.oma.OmaAccountCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface OmaAccountMapper {
    int countByExample(OmaAccountCriteria example);

    int deleteByExample(OmaAccountCriteria example);

    int deleteByPrimaryKey(String uuid);

    int insert(OmaAccount record);

    int insertSelective(OmaAccount record);

    List<OmaAccount> selectByExampleWithRowbounds(OmaAccountCriteria example, RowBounds rowBounds);

    List<OmaAccount> selectByExample(OmaAccountCriteria example);

    OmaAccount selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") OmaAccount record, @Param("example") OmaAccountCriteria example);

    int updateByExample(@Param("record") OmaAccount record, @Param("example") OmaAccountCriteria example);

    int updateByPrimaryKeySelective(OmaAccount record);

    int updateByPrimaryKey(OmaAccount record);
}