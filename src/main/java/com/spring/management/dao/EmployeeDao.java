package com.spring.management.dao;

import java.util.List;

import com.spring.management.entities.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public void delete(int employeeId);
	public void updateEmp(Employee employee);
	public Employee getSingleEmp(int emp_id);
	public List<Employee> getAllEmployee();
}
