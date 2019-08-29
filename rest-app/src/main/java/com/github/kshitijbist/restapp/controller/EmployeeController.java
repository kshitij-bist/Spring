package com.github.kshitijbist.restapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.kshitijbist.restapp.model.Employee;
import com.github.kshitijbist.restapp.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping(path = "/employees")
	public HttpEntity<List<Employee>> getEmployeed() {
		return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
	}

}
