package com.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Connect.MyConnection;
import com.beans.Book.Book;
import com.pojo.Employee;

public class EmployeDAOimpl implements EmployeeDAO {

	@Override
	public boolean addEmployee(Employee emp) {
		boolean rowsAdded=false;
		try {
			
			String ADDEMPLOYE="insert into Employe values(?,?,?,?,?)";
			Connection con = MyConnection.openConnection();
			
			PreparedStatement ps=con.prepareStatement(ADDEMPLOYE);
			ps.setInt(1,emp.getEmpId() );
			ps.setString(2, emp.getEmpName());
			ps.setDouble(3,emp.getSalary() );
			ps.setInt(4, emp.getAge());
			ps.setDate(5, emp.getJoiningdate());
			if(ps.executeUpdate()>0)
			{
				rowsAdded=true;
			}

			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return rowsAdded;
	}

	@Override
	public int updateEmployee(int empId, Employee emp) {
		// TODO Auto-generated method stub
		boolean isUpdated=false;
		String S1="update employe set empName=? where empID=?";
		String S2="update employe set salary=? where empID=?";
		String S3="update employe set age=? where empID=?";
		String S4="update employe set joiningDate=? where empID=?";
		int rows=0;
		try(Connection con=MyConnection.openConnection())
		{
			PreparedStatement ps=con.prepareStatement(S1);
			ps.setString(1, emp.getEmpName());
		    ps.setInt(2, empId);
		    rows=ps.executeUpdate();
		    ps=con.prepareStatement(S2);
		    ps.setDouble(1, emp.getSalary());
		    ps.setInt(2,empId);
		    rows=ps.executeUpdate();
           
		    if(rows>0)
		    {
		    	isUpdated=true;
		    }
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public Employee findEmployeeByid(int empId) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		String FIND_BY_id="select * from employe where empid=?";
				try(Connection con=MyConnection.openConnection())
				{
					PreparedStatement ps=con.prepareStatement(FIND_BY_id);
					ps.setInt(1, empId);
					ResultSet set=ps.executeQuery();
					while(set.next())
					{
						int id=set.getInt("empID");
						String name=set.getString("empName");
						Double sal=set.getDouble("salary");
						int age=set.getInt("age");
						String jd=set.getString("joiningDate");
						//Employee e=new Employee(id,name, sal, age, Date.valueOf(jd));
						e.setEmpId(id);
						e.setEmpName(name);
						e.setSalary(sal);
						e.setAge(age);
						e.setJoiningdate(Date.valueOf(jd));
						System.out.println(e);
		
					}
					
				}
				catch(SQLException ea)
				{
					ea.printStackTrace();
					//return null;
				}
				return e;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployees(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee removeEemployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

}
