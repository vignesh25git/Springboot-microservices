package com.vicky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.pojo.Employee;
import com.vicky.pojo.Response;
import com.vicky.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping("/process")
	@ResponseBody
	public Response processEmployee(@RequestBody Employee employee) {
		
		
		return employeeService.validateEmployee(employee);
		
	}

}
