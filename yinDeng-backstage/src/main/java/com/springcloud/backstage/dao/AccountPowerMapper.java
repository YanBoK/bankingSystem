package com.springcloud.backstage.dao;

import java.util.List;

import com.springcloud.backstage.pojo.AccountPower;

public interface AccountPowerMapper {
	/**查询全部AccountPower表*/
	List<AccountPower> queryAll();
}
