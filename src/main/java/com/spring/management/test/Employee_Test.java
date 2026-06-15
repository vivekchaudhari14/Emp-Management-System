package com.spring.management.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.management.dao.EmployeeDao;
import com.spring.management.entities.Employee;

public class Employee_Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/management/test/EmpConfi.xml");
		EmployeeDao emp = context.getBean("employeeDao",EmployeeDao.class);
		
		Employee em = new Employee();
//		em.setEmp_Id(1);
//		em.setName("Vivek");
//		em.setEmp_Dept("Computer Science");
//		em.setEmp_Loc("Amalner");
//		
//		int add = emp.insert(em);
//		System.out.println("Inserted Employee Details" +add);
		
		emp.delete(1);
	}
}
