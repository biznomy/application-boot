package com.biznomy.application.service;

import java.util.List;

import com.biznomy.application.model.Employee;

public interface EmployeeService {

	List<Employee> list();
	
	String save(Employee employee);
	
	Employee get(String id);	
	
}
