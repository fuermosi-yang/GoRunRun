package com.run.pojo;

import java.util.Date;

public class Statistics {

    private Date createtime;
    private Integer count;

    public Statistics() {
    }

    public Statistics(Date createtime, Integer count) {
        this.createtime = createtime;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "createtime=" + createtime +
                ", count=" + count +
                '}';
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
