package com.run.pojo;

public class Count {
    private Integer receivercount;
    private Integer usercount;
    private Integer ordercount1;
    private Integer ordercount2;
    private Integer ordercount3;
    private Integer ordercount4;
    private Integer ordercount5;
    private Integer ordercount6;
    public Count() {
    }

    public Count(Integer receivercount, Integer usercount, Integer ordercount1, Integer ordercount2, Integer ordercount3, Integer ordercount4, Integer ordercount5, Integer ordercount6) {
        this.receivercount = receivercount;
        this.usercount = usercount;
        this.ordercount1 = ordercount1;
        this.ordercount2 = ordercount2;
        this.ordercount3 = ordercount3;
        this.ordercount4 = ordercount4;
        this.ordercount5 = ordercount5;
        this.ordercount6 = ordercount6;
    }

    public Integer getReceivercount() {
        return receivercount;
    }

    public void setReceivercount(Integer receivercount) {
        this.receivercount = receivercount;
    }

    public Integer getUsercount() {
        return usercount;
    }

    public void setUsercount(Integer usercount) {
        this.usercount = usercount;
    }

    public Integer getOrdercount1() {
        return ordercount1;
    }

    public void setOrdercount1(Integer ordercount1) {
        this.ordercount1 = ordercount1;
    }

    public Integer getOrdercount2() {
        return ordercount2;
    }

    public void setOrdercount2(Integer ordercount2) {
        this.ordercount2 = ordercount2;
    }

    public Integer getOrdercount3() {
        return ordercount3;
    }

    public void setOrdercount3(Integer ordercount3) {
        this.ordercount3 = ordercount3;
    }

    public Integer getOrdercount4() {
        return ordercount4;
    }

    public void setOrdercount4(Integer ordercount4) {
        this.ordercount4 = ordercount4;
    }

    public Integer getOrdercount5() {
        return ordercount5;
    }

    public void setOrdercount5(Integer ordercount5) {
        this.ordercount5 = ordercount5;
    }

    public Integer getOrdercount6() {
        return ordercount6;
    }

    public void setOrdercount6(Integer ordercount6) {
        this.ordercount6 = ordercount6;
    }

    @Override
    public String toString() {
        return "Count{" +
                "receivercount=" + receivercount +
                ", usercount=" + usercount +
                ", ordercount1=" + ordercount1 +
                ", ordercount2=" + ordercount2 +
                ", ordercount3=" + ordercount3 +
                ", ordercount4=" + ordercount4 +
                ", ordercount5=" + ordercount5 +
                ", ordercount6=" + ordercount6 +
                '}';
    }
}
