package com.springcloud.backstage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcloud.backstage.dao.AccountPowerMapper;

@Controller
public class AccountPowerController {
	@Autowired
	private AccountPowerMapper accountPowerMapper;
	
	@RequestMapping("show")
	@ResponseBody
	public String show() {
		return accountPowerMapper.queryAll().toString();
	}
}
