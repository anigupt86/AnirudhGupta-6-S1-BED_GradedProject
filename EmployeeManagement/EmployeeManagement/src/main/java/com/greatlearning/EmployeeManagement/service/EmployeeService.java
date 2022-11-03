package com.greatlearning.EmployeeManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.EmployeeManagement.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theemployee);

	public void deleteById(int theId);

}
