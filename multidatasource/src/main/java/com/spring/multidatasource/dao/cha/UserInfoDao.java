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

    public void updateUser(UserInfoOverview userInfo){
        this.getMapper().updateByPrimaryKey(userInfo);
    }

    public UserInfoOverview queryByPhone(String phone){
        UserInfoOverviewCriteria c = new UserInfoOverviewCriteria();
        UserInfoOverviewCriteria.Criteria cc = c.createCriteria();
        cc.andPhoneEqualTo(phone);
        List<UserInfoOverview> list = this.getMapper().selectByExample(c);
        if(list != null && list.size() > 0){
            return list.get(0);
        }else{
            return null;
        }
    }

    public List<UserInfoOverview> queryList(){
        UserInfoOverviewCriteria c = new UserInfoOverviewCriteria();
        UserInfoOverviewCriteria.Criteria cc = c.createCriteria();
        List<UserInfoOverview> list = this.getMapper().selectByExample(c);
        return list;
    }
}
