package com.biznomy.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biznomy.application.model.Employee;
import com.biznomy.application.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public final class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value="")	
	private ResponseEntity<List<Employee>> list(){
		return new ResponseEntity<List<Employee>>(employeeService.list(), HttpStatus.OK);
	}
		
	@GetMapping(value="/{id}")
	private ResponseEntity<Employee> get(@PathVariable String id){		
		return new ResponseEntity<Employee>(employeeService.get(id), HttpStatus.ACCEPTED);
	}
	
	@PostMapping(value="")
	private ResponseEntity<String> get(@RequestBody Employee employee){		
		return new ResponseEntity<String>(employeeService.save(employee), HttpStatus.CREATED);
	}

}
