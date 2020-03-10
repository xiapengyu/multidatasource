package com.spring.multidatasource.entity.cha;

import java.math.BigDecimal;
import java.util.Date;

public class UserInfoOverview {
    private Integer id;

    private String userUuid;

    private BigDecimal balance;

    private BigDecimal allRechargeAmount;

    private BigDecimal allConsumeAmount;

    private BigDecimal allElectricityKwh;

    private Integer allConsumeNum;

    private String sign;

    private Long totalChargingTime;

    private String phone;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private Short deleteFlag;

    private String provinceId;

    private String cityId;

    private String regionId;

    private String stationUuid;

    private BigDecimal activityLockingAmount;

    private String avatarUrl;

    private String nickName;

    private String unionId;

    private Short isSync;

    private BigDecimal channelLockingAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getAllRechargeAmount() {
        return allRechargeAmount;
    }

    public void setAllRechargeAmount(BigDecimal allRechargeAmount) {
        this.allRechargeAmount = allRechargeAmount;
    }

    public BigDecimal getAllConsumeAmount() {
        return allConsumeAmount;
    }

    public void setAllConsumeAmount(BigDecimal allConsumeAmount) {
        this.allConsumeAmount = allConsumeAmount;
    }

    public BigDecimal getAllElectricityKwh() {
        return allElectricityKwh;
    }

    public void setAllElectricityKwh(BigDecimal allElectricityKwh) {
        this.allElectricityKwh = allElectricityKwh;
    }

    public Integer getAllConsumeNum() {
        return allConsumeNum;
    }

    public void setAllConsumeNum(Integer allConsumeNum) {
        this.allConsumeNum = allConsumeNum;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Long getTotalChargingTime() {
        return totalChargingTime;
    }

    public void setTotalChargingTime(Long totalChargingTime) {
        this.totalChargingTime = totalChargingTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Short getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Short deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getStationUuid() {
        return stationUuid;
    }

    public void setStationUuid(String stationUuid) {
        this.stationUuid = stationUuid;
    }

    public BigDecimal getActivityLockingAmount() {
        return activityLockingAmount;
    }

    public void setActivityLockingAmount(BigDecimal activityLockingAmount) {
        this.activityLockingAmount = activityLockingAmount;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public Short getIsSync() {
        return isSync;
    }

    public void setIsSync(Short isSync) {
        this.isSync = isSync;
    }

    public BigDecimal getChannelLockingAmount() {
        return channelLockingAmount;
    }

    public void setChannelLockingAmount(BigDecimal channelLockingAmount) {
        this.channelLockingAmount = channelLockingAmount;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInfoOverview other = (UserInfoOverview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserUuid() == null ? other.getUserUuid() == null : this.getUserUuid().equals(other.getUserUuid()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getAllRechargeAmount() == null ? other.getAllRechargeAmount() == null : this.getAllRechargeAmount().equals(other.getAllRechargeAmount()))
            && (this.getAllConsumeAmount() == null ? other.getAllConsumeAmount() == null : this.getAllConsumeAmount().equals(other.getAllConsumeAmount()))
            && (this.getAllElectricityKwh() == null ? other.getAllElectricityKwh() == null : this.getAllElectricityKwh().equals(other.getAllElectricityKwh()))
            && (this.getAllConsumeNum() == null ? other.getAllConsumeNum() == null : this.getAllConsumeNum().equals(other.getAllConsumeNum()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getTotalChargingTime() == null ? other.getTotalChargingTime() == null : this.getTotalChargingTime().equals(other.getTotalChargingTime()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getRegionId() == null ? other.getRegionId() == null : this.getRegionId().equals(other.getRegionId()))
            && (this.getStationUuid() == null ? other.getStationUuid() == null : this.getStationUuid().equals(other.getStationUuid()))
            && (this.getActivityLockingAmount() == null ? other.getActivityLockingAmount() == null : this.getActivityLockingAmount().equals(other.getActivityLockingAmount()))
            && (this.getAvatarUrl() == null ? other.getAvatarUrl() == null : this.getAvatarUrl().equals(other.getAvatarUrl()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getUnionId() == null ? other.getUnionId() == null : this.getUnionId().equals(other.getUnionId()))
            && (this.getIsSync() == null ? other.getIsSync() == null : this.getIsSync().equals(other.getIsSync()))
            && (this.getChannelLockingAmount() == null ? other.getChannelLockingAmount() == null : this.getChannelLockingAmount().equals(other.getChannelLockingAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserUuid() == null) ? 0 : getUserUuid().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getAllRechargeAmount() == null) ? 0 : getAllRechargeAmount().hashCode());
        result = prime * result + ((getAllConsumeAmount() == null) ? 0 : getAllConsumeAmount().hashCode());
        result = prime * result + ((getAllElectricityKwh() == null) ? 0 : getAllElectricityKwh().hashCode());
        result = prime * result + ((getAllConsumeNum() == null) ? 0 : getAllConsumeNum().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getTotalChargingTime() == null) ? 0 : getTotalChargingTime().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getRegionId() == null) ? 0 : getRegionId().hashCode());
        result = prime * result + ((getStationUuid() == null) ? 0 : getStationUuid().hashCode());
        result = prime * result + ((getActivityLockingAmount() == null) ? 0 : getActivityLockingAmount().hashCode());
        result = prime * result + ((getAvatarUrl() == null) ? 0 : getAvatarUrl().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getUnionId() == null) ? 0 : getUnionId().hashCode());
        result = prime * result + ((getIsSync() == null) ? 0 : getIsSync().hashCode());
        result = prime * result + ((getChannelLockingAmount() == null) ? 0 : getChannelLockingAmount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userUuid=").append(userUuid);
        sb.append(", balance=").append(balance);
        sb.append(", allRechargeAmount=").append(allRechargeAmount);
        sb.append(", allConsumeAmount=").append(allConsumeAmount);
        sb.append(", allElectricityKwh=").append(allElectricityKwh);
        sb.append(", allConsumeNum=").append(allConsumeNum);
        sb.append(", sign=").append(sign);
        sb.append(", totalChargingTime=").append(totalChargingTime);
        sb.append(", phone=").append(phone);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", regionId=").append(regionId);
        sb.append(", stationUuid=").append(stationUuid);
        sb.append(", activityLockingAmount=").append(activityLockingAmount);
        sb.append(", avatarUrl=").append(avatarUrl);
        sb.append(", nickName=").append(nickName);
        sb.append(", unionId=").append(unionId);
        sb.append(", isSync=").append(isSync);
        sb.append(", channelLockingAmount=").append(channelLockingAmount);
        sb.append("]");
        return sb.toString();
    }
}