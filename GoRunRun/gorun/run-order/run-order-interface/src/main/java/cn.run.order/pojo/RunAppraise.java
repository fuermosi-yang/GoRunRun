package cn.run.order.pojo;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "run_appraise")
public class RunAppraise{

	@Id
	private Long appraiseId;

	private String appraiseshow;

	private Long uid;

	private Long rid;

	private Long status;

	private String reason;

	private String aname;

	public Long getAppraiseId() {
		return appraiseId;
	}

	public void setAppraiseId(Long appraiseId) {
		this.appraiseId = appraiseId;
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

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}
}