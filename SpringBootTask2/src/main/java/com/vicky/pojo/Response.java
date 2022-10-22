package com.vicky.pojo;

public class Response {
	
	private Employee employee;
	private String response;
	
	public Response(Employee employee, String response) {
		super();
		this.employee = employee;
		this.response = response;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
	

}
