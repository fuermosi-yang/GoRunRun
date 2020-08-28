package com.run.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RunUser {
    private Long uid;
    private String uname;
    private String username;
    private String password;
    private String usex;
    private String uphotot;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ucreatetime;
    private String uphone;
    private Long rid;
    private String address;
    private Integer status;
    private Integer  pageNum;
    private Integer lastPage;

    @Override
    public String toString() {
        return "RunUser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", usex='" + usex + '\'' +
                ", uphotot='" + uphotot + '\'' +
                ", ucreatetime=" + ucreatetime +
                ", uphone='" + uphone + '\'' +
                ", rid=" + rid +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", pageNum=" + pageNum +
                ", lastPage=" + lastPage +
                '}';
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUphotot() {
        return uphotot;
    }

    public void setUphotot(String uphotot) {
        this.uphotot = uphotot;
    }

    public Date getUcreatetime() {
        return ucreatetime;
    }

    public void setUcreatetime(Date ucreatetime) {
        this.ucreatetime = ucreatetime;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getLastPage() {
        return lastPage;
    }

    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

    public RunUser() {
    }

    public RunUser(Long uid, String uname, String username, String password, String usex, String uphotot, Date ucreatetime, String uphone, Long rid, String address, Integer status, Integer pageNum, Integer lastPage) {
        this.uid = uid;
        this.uname = uname;
        this.username = username;
        this.password = password;
        this.usex = usex;
        this.uphotot = uphotot;
        this.ucreatetime = ucreatetime;
        this.uphone = uphone;
        this.rid = rid;
        this.address = address;
        this.status = status;
        this.pageNum = pageNum;
        this.lastPage = lastPage;
    }
}
