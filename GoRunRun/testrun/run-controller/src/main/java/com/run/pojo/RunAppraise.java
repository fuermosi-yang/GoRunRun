package com.run.pojo;

public class RunAppraise {
    private Long appraiseid;
    private String appraiseshow;
    private Long uid;
    private Long rid;
    private Long status;
    private String reason;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "RunAppraise{" +
                "appraiseid=" + appraiseid +
                ", appraiseshow='" + appraiseshow + '\'' +
                ", uid=" + uid +
                ", rid=" + rid +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public Long getAppraiseid() {
        return appraiseid;
    }

    public void setAppraiseid(Long appraiseid) {
        this.appraiseid = appraiseid;
    }

    public String getAppraiseshow() {
        return appraiseshow;
    }

    public void setAppraiseshow(String appraiseshow) {
        this.appraiseshow = appraiseshow;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public RunAppraise() {
    }

    public RunAppraise(Long appraiseid, String appraiseshow, Long uid, Long rid, Long status, String reason, String username) {
        this.appraiseid = appraiseid;
        this.appraiseshow = appraiseshow;
        this.uid = uid;
        this.rid = rid;
        this.status = status;
        this.reason = reason;
        this.username = username;
    }
}
