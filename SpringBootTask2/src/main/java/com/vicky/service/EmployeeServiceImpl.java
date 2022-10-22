package com.vicky.service;

import org.springframework.stereotype.Service;

import com.vicky.exception.InvalidEmployeeAgeException;
import com.vicky.exception.InvalidEmployeeNameException;
import com.vicky.pojo.Employee;
import com.vicky.pojo.Response;
import com.vicky.utils.Validate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Response validateEmployee(Employee employee) {
		
		if (Validate.validateSpecialCharacter(employee.getEmpname())) {
			
			System.out.println("validate special character");
			throw new InvalidEmployeeNameException("Employee name contains Special character - Invalid");
			
		}
		else {
			return new Response(employee,"Good Employee");

		}
		
		
	//	if (!Validate.isFirstCharCapital(employee.getEmpname())) {
	//		
	//		throw new InvalidEmployeeAgeException("Invalid age ");
	//	}
		
		
		
	}

}
