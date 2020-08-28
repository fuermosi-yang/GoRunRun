package com.run.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RunReceiver {
    private Long rid;
    private String rname;
    private String rsex;
    private String rphoto;
    private String rusername;
    private String rpassword;
    private String phone;
    private String address;
    private String addressing;
    private Long status;
    private Long userid;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date rcreatetime;
    private Double rmoney;
    private Integer pageNum;
    private Integer lastPage;

    @Override
    public String toString() {
        return "RunReceiver{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rsex='" + rsex + '\'' +
                ", rphoto='" + rphoto + '\'' +
                ", rusername='" + rusername + '\'' +
                ", rpassword='" + rpassword + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", addressing='" + addressing + '\'' +
                ", status=" + status +
                ", userid=" + userid +
                ", rcreatetime=" + rcreatetime +
                ", rmoney=" + rmoney +
                ", pageNum=" + pageNum +
                ", lastPage=" + lastPage +
                '}';
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRsex() {
        return rsex;
    }

    public void setRsex(String rsex) {
        this.rsex = rsex;
    }

    public String getRphoto() {
        return rphoto;
    }

    public void setRphoto(String rphoto) {
        this.rphoto = rphoto;
    }

    public String getRusername() {
        return rusername;
    }

    public void setRusername(String rusername) {
        this.rusername = rusername;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressing() {
        return addressing;
    }

    public void setAddressing(String addressing) {
        this.addressing = addressing;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Date getRcreatetime() {
        return rcreatetime;
    }

    public void setRcreatetime(Date rcreatetime) {
        this.rcreatetime = rcreatetime;
    }

    public Double getRmoney() {
        return rmoney;
    }

    public void setRmoney(Double rmoney) {
        this.rmoney = rmoney;
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

    public RunReceiver() {
    }

    public RunReceiver(Long rid, String rname, String rsex, String rphoto, String rusername, String rpassword, String phone, String address, String addressing, Long status, Long userid, Date rcreatetime, Double rmoney, Integer pageNum, Integer lastPage) {
        this.rid = rid;
        this.rname = rname;
        this.rsex = rsex;
        this.rphoto = rphoto;
        this.rusername = rusername;
        this.rpassword = rpassword;
        this.phone = phone;
        this.address = address;
        this.addressing = addressing;
        this.status = status;
        this.userid = userid;
        this.rcreatetime = rcreatetime;
        this.rmoney = rmoney;
        this.pageNum = pageNum;
        this.lastPage = lastPage;
    }
}
