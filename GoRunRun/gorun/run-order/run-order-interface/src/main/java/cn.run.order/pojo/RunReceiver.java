package cn.run.order.pojo;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Table(name="run_receiver")
public class RunReceiver{

	@Id
	private Long rid;

	private String rname;

	private String rsex;

	private String rphoto;

	private String rusername;

	private String rpassword;

	private String phone;

	private String address;

	private String addresssing;

	private Long status;

	private Long userid;

	private Date rcreatetime;

	private Double rmoney;
	@Transient
	private String code;

	public String getRsex() {
		return rsex;
	}

	public void setRsex(String rsex) {
		this.rsex = rsex;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getAddresssing() {
		return addresssing;
	}

	public void setAddresssing(String addresssing) {
		this.addresssing = addresssing;
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
}