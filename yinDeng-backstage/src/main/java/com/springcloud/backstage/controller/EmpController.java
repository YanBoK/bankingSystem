package com.springcloud.backstage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcloud.backstage.dao.EmpMapper;

@Controller
public class EmpController {
	@Autowired
	private EmpMapper empMapper;
	
	@RequestMapping("showEmp.do")
	public String showEmp(HttpServletRequest request) {
		request.setAttribute("emps", empMapper.queryAll());
		return "forward:emp.jsp";
	}
}
