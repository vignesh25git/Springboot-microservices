package com.vicky.service;

import org.springframework.stereotype.Service;

import com.vicky.exception.InvalidAgeException;
import com.vicky.exception.InvalidCharacterException;
import com.vicky.exception.InvalidFirstLetterException;
import com.vicky.pojo.Employee;
import com.vicky.pojo.Response;
import com.vicky.utils.Validate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Response validateEmployee(Employee employee) {

		if (Validate.validateSpecialCharacter(employee.getEmpname())) {

			throw new InvalidCharacterException();

		}

		if (!Validate.isFirstCharCapital(employee.getEmpname())) {

			throw new InvalidFirstLetterException();

		}

		if (!Validate.isAgeinLimit(employee.getEmpage())) {

			throw new InvalidAgeException();

		}

		return new Response(employee, "Good Employee");

	}

}
