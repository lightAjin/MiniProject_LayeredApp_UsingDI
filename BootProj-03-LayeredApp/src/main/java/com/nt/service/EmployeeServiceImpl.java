package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;
	
	public List<Employee> fetchAllEmployeesByDesgs(String desg1,String desg2,String desg3) throws Exception{
		
		List<Employee> list=dao.getEmployeesByDesg(desg1, desg2, desg3);
		
		//calculate Gross Sal and Net Sal
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5)); 
		});
		
		return list;
	}
	
	
}
