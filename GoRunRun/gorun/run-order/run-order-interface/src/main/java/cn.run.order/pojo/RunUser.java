package cn.run.order.pojo;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Table(name="run_user")
public class RunUser{

	@Id
	private Long uid;

	private String uname;

	private String username;

	private String password;

	private String usex;

	private String uphotot;

	private Date ucreatetime;

	private Long rid;

	private String address;

	private Long status;

	private String uphone;
	@Transient
	private String code;

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
}