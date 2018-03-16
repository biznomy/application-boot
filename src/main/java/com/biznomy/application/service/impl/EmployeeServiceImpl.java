package com.biznomy.application.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biznomy.application.model.Employee;
import com.biznomy.application.repository.EmployeeRepository;
import com.biznomy.application.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> list() {
		return employeeRepository.findAll();
	}

	@Override
	public String save(Employee employee) {
		return employeeRepository.save(employee).getId();
	}

	@Override
	public Employee get(String id) {
		return employeeRepository.findOne(id);
	}

}
