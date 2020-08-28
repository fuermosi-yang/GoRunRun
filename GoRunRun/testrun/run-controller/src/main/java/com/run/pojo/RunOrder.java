package com.run.pojo;

public class RunOrder {
    private Long oid;
    private Long rid;
    private Long uid;
    private String oname;
    private String odescribe;
    private Integer ostatus;
    private Double price;
    private Long shenheorder;

    private String reason;
    private String username;

    @Override
    public String toString() {
        return "RunOrder{" +
                "oid=" + oid +
                ", rid=" + rid +
                ", uid=" + uid +
                ", oname='" + oname + '\'' +
                ", odescribe='" + odescribe + '\'' +
                ", ostatus=" + ostatus +
                ", price=" + price +
                ", shenheorder=" + shenheorder +
                ", reason='" + reason + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOdescribe() {
        return odescribe;
    }

    public void setOdescribe(String odescribe) {
        this.odescribe = odescribe;
    }

    public Integer getOstatus() {
        return ostatus;
    }

    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getShenheorder() {
        return shenheorder;
    }

    public void setShenheorder(Long shenheorder) {
        this.shenheorder = shenheorder;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RunOrder() {
    }

    public RunOrder(Long oid, Long rid, Long uid, String oname, String odescribe, Integer ostatus, Double price, Long shenheorder, String reason, String username) {
        this.oid = oid;
        this.rid = rid;
        this.uid = uid;
        this.oname = oname;
        this.odescribe = odescribe;
        this.ostatus = ostatus;
        this.price = price;
        this.shenheorder = shenheorder;
        this.reason = reason;
        this.username = username;
    }
}
