package com.github.kshitijbist.restapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.kshitijbist.restapp.model.Employee;
import com.github.kshitijbist.restapp.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

}
