package com.spring.management.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.management.entities.Employee;

public class EmployeeDaoImple implements EmployeeDao {

	private HibernateTemplate hibernateTemplate;
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	@Override
	@Transactional
	public int insert(Employee employee) {
		
		Integer i = (Integer)this.hibernateTemplate.save(employee);
		return i;
	}



	@Override
	@Transactional
	public void delete(int employeeId) {
		Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
		this.hibernateTemplate.delete(employee);
		System.out.println("Employee Deleted"+employeeId);
	}



	@Override
	@Transactional
	public void updateEmp(Employee employee) {
			this.hibernateTemplate.update(employee);
	}



	@Override
	public Employee getSingleEmp(int emp_id) {
		Employee employee = this.hibernateTemplate.get(Employee.class,emp_id);
		return employee;
	}



	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee = this.hibernateTemplate.loadAll(Employee.class);
		return employee;
	}
	
}
