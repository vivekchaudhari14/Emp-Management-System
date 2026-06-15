package com.spring.management.dao;

import com.spring.management.entities.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public void delete(int employeeId);
}
