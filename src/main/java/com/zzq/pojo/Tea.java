package com.zzq.pojo;

public class Tea {
    private Integer teaId;

    private String teaName;  //姓名

    private String account;     //账号

    private String password;  //密码

    private Integer status;  //状态

    private String teaTel;  //电话

    private String teaCard;  //员工卡

    private String teaColl;//学院

    private Integer teaSex;//性别

    private String teaImg;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTeaTel() {
        return teaTel;
    }

    public void setTeaTel(String teaTel) {
        this.teaTel = teaTel == null ? null : teaTel.trim();
    }

    public String getTeaCard() {
        return teaCard;
    }

    public void setTeaCard(String teaCard) {
        this.teaCard = teaCard == null ? null : teaCard.trim();
    }

    public String getTeaColl() {
        return teaColl;
    }

    public void setTeaColl(String teaColl) {
        this.teaColl = teaColl == null ? null : teaColl.trim();
    }

    public Integer getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(Integer teaSex) {
        this.teaSex = teaSex;
    }

    public String getTeaImg() {
        return teaImg;
    }

    public void setTeaImg(String teaImg) {
        this.teaImg = teaImg == null ? null : teaImg.trim();
    }
}