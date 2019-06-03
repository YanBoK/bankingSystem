package com.springcloud.backstage.pojo;

import java.io.Serializable;

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
}
