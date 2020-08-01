package com.ssm.entity;

import java.util.Date;

/**
 * @author lizhennan
 * @version 1.0
 * @describe
 * @date 2020/7/28
 */
public class User {
    private int id;
    private String userName;
    private String age;
    private String userPho;
    private String ctfNbr;
    private String isAuth;
    private Date lastModifyTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserPho() {
        return userPho;
    }

    public void setUserPho(String userPho) {
        this.userPho = userPho;
    }

    public String getCtfNbr() {
        return ctfNbr;
    }

    public void setCtfNbr(String ctfNbr) {
        this.ctfNbr = ctfNbr;
    }

    public String getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(String isAuth) {
        this.isAuth = isAuth;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", userPho='" + userPho + '\'' +
                ", ctfNbr='" + ctfNbr + '\'' +
                ", isAuth='" + isAuth + '\'' +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}
