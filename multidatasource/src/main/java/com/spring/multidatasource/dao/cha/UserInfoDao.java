package com.spring.multidatasource.dao.cha;

import com.spring.multidatasource.base.BaseDao;
import com.spring.multidatasource.entity.cha.UserInfoOverview;
import com.spring.multidatasource.entity.cha.UserInfoOverviewCriteria;
import com.spring.multidatasource.entity.oma.OmaAccount;
import com.spring.multidatasource.mapper.cha.UserInfoOverviewMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserInfoDao extends BaseDao<UserInfoOverviewMapper, UserInfoOverviewMapper, UserInfoOverview> {

    @Override
    protected void setMapperClass() {
        this.setMapperClass(UserInfoOverviewMapper.class);
        this.setExtMapperClass(UserInfoOverviewMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(UserInfoOverview.class);
    }

    public void saveUser(UserInfoOverview userInfo) {
        this.getMapper().insert(userInfo);
    }

    public List<UserInfoOverview> queryList(){
        UserInfoOverviewCriteria c = new UserInfoOverviewCriteria();
        UserInfoOverviewCriteria.Criteria cc = c.createCriteria();
        List<UserInfoOverview> list = this.getMapper().selectByExample(c);
        return list;
    }
}
