package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmpDaoImpl implements EmpDao{
	
	
	static Connection conn;
	static PreparedStatement selemp;
	
	static {
		
		conn = DBUtil.getMyConnection();
		try {
			selemp = conn.prepareStatement("select * from employeenew");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee>lst = new ArrayList<>();
		
		try {
			ResultSet rs = selemp.executeQuery();
			
			while(rs.next())
			{
				Employee e = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));
				lst.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}

}
