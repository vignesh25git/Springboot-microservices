package com.vicky.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.dto.PersonDto;
import com.vicky.entity.Employee;
import com.vicky.entity.Person;
import com.vicky.repo.EmployeeRepos;
import com.vicky.repo.PersonRepos;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepos employeeRepos;
	
	@Autowired
	private PersonRepos personRepos;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepos.findAll();
		
	}

	@Override
	public PersonDto getPersonDetails(Integer empid) {
		// TODO Auto-generated method stub
		
		List<Employee>  emplist = employeeRepos.findAll();
		List<Person>  personlist = personRepos.findAll();
		
		System.out.println(emplist);
		
		Integer empsalary = emplist.stream()
	       .filter(emp -> emp.getEmpid() == empid)
	       .collect(Collectors.toList()).get(0).getEmpsalary();
		
		PersonDto personDto = new PersonDto();
		personDto.setEmpsal(empsalary);
		
		Person p  = personlist.stream()
				  .filter(person -> person.getEmpid() == empid)
				  .collect(Collectors.toList()).get(0);
				  
		
		personDto.setPerson(p);
		
		
		return personDto;
	}

}
