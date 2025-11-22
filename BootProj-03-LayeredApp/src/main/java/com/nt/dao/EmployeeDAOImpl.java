package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {

	public static final String GET_EMPS_QUERY="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Employee> getEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {
		
		List<Employee> list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);){
			//set values to query params
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			//execute the sql query
			try(ResultSet rs=ps.executeQuery();){
				list=new ArrayList<>();
				//copy each record of resultset obj to Model class obj
				while(rs.next()) {
					//copy each record to employee class obj
					Employee emp=new Employee();
					emp.setEno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setDeptno(rs.getInt(5));
					
					//add each model class obj to rs
					list.add(emp);
				}
			} //try2
		} //try1
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
