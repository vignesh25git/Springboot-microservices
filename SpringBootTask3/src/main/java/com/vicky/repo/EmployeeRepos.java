package com.vicky.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vicky.entity.Employee;

@Repository
public interface EmployeeRepos extends JpaRepository<Employee, Integer>{
	
//	public List<Employee> getAllEmployee();
//	public Employee getEmployee(Integer empid);
//	public Employee saveEmployee(Employee employee);

}
