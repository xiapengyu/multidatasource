package com.spring.multidatasource.dto;

public class AccountDto {

    private String phone;

    private String unionId;

    private String uuid;

    public AccountDto() {
    }

    public AccountDto(String phone, String unionId, String uuid) {
        this.phone = phone;
        this.unionId = unionId;
        this.uuid = uuid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
