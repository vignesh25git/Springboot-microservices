package com.vicky.service;

import org.springframework.stereotype.Service;

import com.vicky.exception.AgeException;
import com.vicky.exception.InvalidAgeException;
import com.vicky.exception.InvalidEmployeeNameException;
import com.vicky.pojo.Employee;
import com.vicky.pojo.Response;
import com.vicky.utils.Validate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Response validateEmployee(Employee employee) {
		
		if (Validate.validateSpecialCharacter(employee.getEmpname())) {
			
			throw new InvalidEmployeeNameException("Employee name contains Special character - Invalid");
			
		}
		
		if (!Validate.isFirstCharCapital(employee.getEmpname())) {
			
			throw new InvalidEmployeeNameException("Employee name should start with capital letter");
			
		}
		
		if (!Validate.isAgeinLimit(employee.getEmpage())) {
			
			throw new AgeException("Employee age should be 1 - 44");
			
		} else {
			
			return new Response(employee,"Good Employee");
		}
		
		
	}

}
