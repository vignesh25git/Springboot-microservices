package com.vicky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vicky.dto.PersonDto;
import com.vicky.entity.Employee;
import com.vicky.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/all")
	@ResponseBody
	public List<Employee> getEmployee(){
		
		return employeeService.getAllEmployees();
		
	}
	
	@RequestMapping("/person/{empid}")
	@ResponseBody
	public PersonDto getPerson(@PathVariable("empid") Integer empid){
		
		return employeeService.getPersonDetails(empid);
		
	}
	

}
