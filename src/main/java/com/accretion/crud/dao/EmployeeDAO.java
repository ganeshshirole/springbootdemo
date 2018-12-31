package com.accretion.crud.dao;

import java.util.List;

import com.accretion.crud.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}