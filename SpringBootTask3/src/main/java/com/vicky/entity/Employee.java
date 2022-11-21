package com.vicky.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@Column(name="EMPID")
	private Integer empid;
	@Column(name="EMPNAME")
	private String empname;
	@Column(name="EMPSALARY")
	private Integer empsalary;
	
	
	public Employee() {
		super();
	}
	public Employee(Integer empid, String empname, Integer empsalary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(Integer empsalary) {
		this.empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	
	
	
	

}
