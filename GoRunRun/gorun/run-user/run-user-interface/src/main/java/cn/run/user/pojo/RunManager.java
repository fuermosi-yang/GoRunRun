package cn.run.user.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "run_manager")
public class RunManager{

	@Id
	private Long mid;

	private String musername;

	private String password;

	public Long getMid() {
		return mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public String getMusername() {
		return musername;
	}

	public void setMusername(String musername) {
		this.musername = musername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}