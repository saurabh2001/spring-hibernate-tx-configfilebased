package com.howto.dao;


import java.util.List;

import com.howto.model.Employee;


public interface EmployeeDao {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeBySsn(String ssn);
	
	Employee findBySsn(String ssn);
	
	void updateEmployee(Employee employee);
}