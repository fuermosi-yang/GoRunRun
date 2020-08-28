package cn.run.user.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name="run_order")
public class RunOrder{

	@Id
	private Long oid;

	private Long uid;

	private Long rid;

	private String oname;

	private String odescribe;

	private Date createtime;

	private Integer ostatus;

	private Double price;

	private Long shenheorder;

	private String reason;

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
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
}