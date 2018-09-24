package com.daos;

import java.util.List;

import com.pojo.Employee;

public interface EmployeeDAO {
	boolean addEmployee(Employee emp);
	int updateEmployee(int empId,Employee emp);
	Employee findEmployeeByid(int empId);
	List<Employee>findAllEmployees();
	List<Employee>findAllEmployees(double salary);
	Employee removeEemployee(int empid);
}
