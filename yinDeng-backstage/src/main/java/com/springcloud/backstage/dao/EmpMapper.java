package com.springcloud.backstage.dao;

import java.util.List;

import com.springcloud.backstage.pojo.Emp;

public interface EmpMapper {
	List<Emp> queryAll();
}
