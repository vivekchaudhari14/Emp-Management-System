# Employee Management System using Spring ORM and Hibernate

## Overview

The Employee Management System is a Java-based CRUD application developed using the Spring Framework, 
Hibernate ORM, and MySQL Database. The project demonstrates how Spring ORM integrates with Hibernate to simplify database operationsand reduce boilerplate code.

The application follows the DAO (Data Access Object) design pattern and provides functionality to manage employee records efficiently.
It allows users to perform Create, Read, Update, and Delete (CRUD) operations while leveraging Spring's dependency injection, transaction management, 
and HibernateTemplate support.

This project is designed for learning and understanding the fundamentals of Spring ORM, Hibernate configuration, database connectivity, transaction management, 
and object-relational mapping concepts.

### Key Features

* Add new employee records
* Update existing employee information
* Delete employee records
* Retrieve employee details by ID
* View all employees
* Transaction management using Spring
* Hibernate ORM integration
* MySQL database connectivity
* DAO design pattern implementation
* XML-based Spring configuration

### Project Objectives

* Understand Spring ORM architecture
* Learn Hibernate integration with Spring
* Perform CRUD operations using HibernateTemplate
* Implement transaction management
* Apply Dependency Injection (DI)
* Connect Java applications with MySQL database
* Follow clean architecture using the DAO pattern

### Technology Stack

| Technology        | Purpose                            |
| ----------------- | ---------------------------------- |
| Java              | Programming Language               |
| Spring Framework  | Dependency Injection & ORM Support |
| Hibernate ORM     | Object Relational Mapping          |
| MySQL             | Database                           |
| HibernateTemplate | Database Operations                |
| Maven (Optional)  | Dependency Management              |
| Eclipse IDE       | Development Environment            |

### Architecture Flow

```text
Client/Application
        │
        ▼
EmployeeDao Interface
        │
        ▼
EmployeeDaoImpl
        │
        ▼
HibernateTemplate
        │
        ▼
SessionFactory
        │
        ▼
MySQL Database
```

### CRUD Operations Implemented

1. Insert Employee
2. Update Employee
3. Delete Employee
4. Get Employee By ID
5. Get All Employees

### Learning Outcomes

After completing this project, you will gain practical experience in:

* Spring ORM Configuration
* Hibernate Session Management
* HibernateTemplate Usage
* Transaction Handling
* Dependency Injection
* DAO Pattern Implementation
* MySQL Integration
* CRUD Application Development


Author

Vivek Chaudhari

Spring Framework + Hibernate ORM Practice Project
