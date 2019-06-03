package com.springcloud.backstage.pojo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class AccountPower implements Serializable {

	private static final long serialVersionUID = 1L;
	

	/**序列自动生成的id*/
	private Integer id;
	/**账户权限代码*/
	private Integer userPowerCode;
	/**账户权限*/
	private String userPower;
	/**账户权限说明*/
	private String userPowerRemarks;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserPowerCode() {
		return userPowerCode;
	}
	public void setUserPowerCode(Integer userPowerCode) {
		this.userPowerCode = userPowerCode;
	}
	public String getUserPower() {
		return userPower;
	}
	public void setUserPower(String userPower) {
		this.userPower = userPower;
	}
	public String getUserPowerRemarks() {
		return userPowerRemarks;
	}
	public void setUserPowerRemarks(String userPowerRemarks) {
		this.userPowerRemarks = userPowerRemarks;
	}
	@Override
	public String toString() {
		return "AccountPower [id=" + id + ", userPowerCode=" + userPowerCode + ", userPower=" + userPower
				+ ", userPowerRemarks=" + userPowerRemarks + "]";
	}
	
	
}
