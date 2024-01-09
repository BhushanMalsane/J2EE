package com.demo.service;

import java.util.List;

import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;
import com.demo.model.Employee;

public class EmpServiceImpl implements EmpService {

	
	private EmpDao edao;
	
	public EmpServiceImpl()
	{
		this.edao = new EmpDaoImpl();
	}
	
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return edao.getAllEmployees();
	}

}
