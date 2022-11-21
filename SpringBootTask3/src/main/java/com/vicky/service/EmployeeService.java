package com.vicky.service;

import java.util.List;

import com.vicky.dto.PersonDto;
import com.vicky.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public PersonDto getPersonDetails(Integer empid);
	

}
