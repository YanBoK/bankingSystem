package com.springcloud.backstage.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * Emp表实体类
 * @author ChenHao
 *
 */
public class Emp implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String empno;
	private String ename;
	private String job;
	private String mgrName;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private String dname;
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgrName() {
		return mgrName;
	}
	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgrName=" + mgrName + ", hiredate=" + hiredate + ", sal="
				+ sal + ", comm=" + comm + ", dname=" + dname + "]";
	}
	
}
