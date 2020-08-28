package cn.run.user.pojo;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "run_appraise")
public class RunAppraise{

	@Id
	private Long appraiseId;

	private String appraiseShow;

	private Long uid;

	private Long rid;

	private Long status;

	private String reason;
	private String aname;

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
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

	public Long getAppraiseId() {
		return appraiseId;
	}

	public void setAppraiseId(Long appraiseId) {
		this.appraiseId = appraiseId;
	}

	public String getAppraiseShow() {
		return appraiseShow;
	}

	public void setAppraiseShow(String appraiseShow) {
		this.appraiseShow = appraiseShow;
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
}