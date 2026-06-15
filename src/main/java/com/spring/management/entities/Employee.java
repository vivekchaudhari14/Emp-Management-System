package com.spring.management.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class Employee {
	@Id
	@Column(name = "Employee_Id")
	private int emp_Id;
	@Column(name ="Employee_Name")
	private String name;
	@Column(name = "Employee_Department")
	private String emp_Dept;
	@Column(name = "Employee_Location")
	private String emp_Loc;
	
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmp_Dept() {
		return emp_Dept;
	}
	public void setEmp_Dept(String emp_Dept) {
		this.emp_Dept = emp_Dept;
	}
	public String getEmp_Loc() {
		return emp_Loc;
	}
	public void setEmp_Loc(String emp_Loc) {
		this.emp_Loc = emp_Loc;
	}
	public Employee(int emp_Id, String name, String emp_Dept, String emp_Loc) {
		super();
		this.emp_Id = emp_Id;
		this.name = name;
		this.emp_Dept = emp_Dept;
		this.emp_Loc = emp_Loc;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + ", emp_Dept=" + emp_Dept + ", emp_Loc=" + emp_Loc
				+ "]";
	}
	
	
	
}
