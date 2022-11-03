package com.greatlearning.EmployeeManagement.service;

import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.greatlearning.EmployeeManagement.entity.Employee;
import com.greatlearning.EmployeeManagement.repository.EmployeeRepository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Transactional
	public List<Employee> findAll() {

		List<Employee> employees = employeeRepository.findAll();

		return employees;
	}

	@Transactional
	public Employee findById(int id) {

		Employee employee = new Employee();

		// find record with Id from the database table
		employee = employeeRepository.findById(id).get();

		return employee;
	}

	@Transactional
	public void save(Employee theEmployee) {

		employeeRepository.save(theEmployee);

	}

	@Transactional
	public void deleteById(int id) {

		employeeRepository.deleteById(id);

	}


}
