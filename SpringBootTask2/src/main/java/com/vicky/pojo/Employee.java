package com.vicky.pojo;

public class Employee {
	
	private String empname;
	private int empage;
	

	public Employee() {
		super();
	}

	public Employee(String empname, int empage) {
		super();
		this.empname = empname;
		this.empage = empage;
	}
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empage=" + empage + "]";
	}
	
	
	

}
