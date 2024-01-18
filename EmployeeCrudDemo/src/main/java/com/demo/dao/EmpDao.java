package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmpDao {

	List<Employee> getAllEmployees();

    void removeById(int empid);

	Employee findById(int empid);

	void updateById(Employee e);

	void insert(Employee e);

	
	



}
