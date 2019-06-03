package com.springcloud.backstage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.backstage.dao.EmpMapper;

@RestController
public class EmpController {
	@Autowired
	private EmpMapper empMapper;
	
	@RequestMapping("showEmp.do")
	public String showEmp(HttpServletRequest request) {
		System.out.println(empMapper.queryAll());
		return empMapper.queryAll().toString();
	}
}
