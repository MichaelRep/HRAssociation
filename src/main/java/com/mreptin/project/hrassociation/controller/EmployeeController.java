package com.mreptin.project.hrassociation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mreptin.project.hrassociation.model.Employee;
import com.mreptin.project.hrassociation.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Get all employees
	 */
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeService.getEmployees();
	}

	/**
	 * Get one employee by id
	 */
	@GetMapping("/employee")
	public Optional<Employee> getEmployee(@RequestParam Long id) {
		return employeeService.getEmployee(id);
	}

	/**
	 * Delete one employee by id
	 */
	@DeleteMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam Long id) {
		employeeService.deleteEmployee(id);
	}

	/**
	 * Create new employee
	 */
	@PostMapping("/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	/**
	 * Get a list of employee
	 */
	@GetMapping("/employeesList")
	public Iterable<Employee> getEmployeesList(Iterable<Long> ids) {
		return employeeService.getEmployeesById(ids);
	}
}
