package com.spring.multidatasource.dao.oma;

import com.spring.multidatasource.base.BaseDao;
import com.spring.multidatasource.entity.oma.OmaAccount;
import com.spring.multidatasource.entity.oma.OmaAccountCriteria;
import com.spring.multidatasource.mapper.oma.OmaAccountMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDao extends BaseDao<OmaAccountMapper, OmaAccountMapper, OmaAccount> {

    @Override
    protected void setMapperClass() {
        this.setMapperClass(OmaAccountMapper.class);
        this.setExtMapperClass(OmaAccountMapper.class);
    }

    @Override
    protected void setEntityClass() {
        this.setEntityClass(OmaAccount.class);
    }

    public int saveAccount(OmaAccount account) {
        return this.getMapper().insert(account);
    }

    public List<OmaAccount> queryList() {
        OmaAccountCriteria c = new OmaAccountCriteria();
        OmaAccountCriteria.Criteria cc = c.createCriteria();
        List<OmaAccount> list = this.getMapper().selectByExample(c);
        return list;
    }

    public OmaAccount queryByPhone(String phone) {
        OmaAccountCriteria c = new OmaAccountCriteria();
        OmaAccountCriteria.Criteria cc = c.createCriteria();
        cc.andPhoneEqualTo(phone);
        List<OmaAccount> list = this.getMapper().selectByExample(c);
        if(list != null && !list.isEmpty()){
            return list.get(0);
        }else{
            return null;
        }
    }
}
