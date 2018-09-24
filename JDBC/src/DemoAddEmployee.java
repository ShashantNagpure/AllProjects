import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

import com.pojo.Employee;
import com.beans.Book.Book;
import com.dao.impl.BookDAOimpl;
import  com.daos.*;
public class DemoAddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stubBookDAOimpl dao=new BookDAOimpl();
		Employee em=new Employee();
		EmployeDAOimpl imp=new EmployeDAOimpl();
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		
		try {
			while(true) {
			System.out.println("1.Add new Employee 2.update employee 3.find employee by id");
			int option=Integer.parseInt(br.readLine());
			if(option==1)
			{
			System.out.println("Enter employee details:id,name,salary,age,joining date(yyyy-mm-dd)");
			int id=Integer.parseInt(br.readLine());
			String name=br.readLine();
			double salary=Double.parseDouble(br.readLine());
			int age=Integer.parseInt(br.readLine());
			Date joining_date=Date.valueOf(br.readLine());   //(br.readLine());
			em.setEmpId(id);
			em.setAge(age);
			em.setSalary(salary);
			em.setJoiningdate(joining_date);
			em.setEmpName(name);

			//imp.addEmployee(emp);
			if(imp.addEmployee(em))
			{
				System.out.println("data inserted success");
			}
			else
			{
				System.out.println("no row added");
			}
			}
			
			else if(option==2)
			{
				Employee emp=new Employee();
				System.out.println("enter empid for for which emp ");
				int empid=Integer.parseInt(br.readLine());
				System.out.println("enter empname");
				String name=br.readLine();
				System.out.println("enter salary");
				Double sal=Double.parseDouble(br.readLine());
				emp.setEmpName(name);
				emp.setSalary(sal);
				if(imp.updateEmployee(empid, emp)>0)
				{
					System.out.println("price updated success");
				}
				else
				{
					System.out.println("no record found");
				}
				
			}
			else if(option==3)
			{
				System.out.println("Enter employee id: ");
				int a=Integer.parseInt(br.readLine());
				Employee q=imp.findEmployeeByid(a);
				
			}
			}
		}

		catch (IOException e) {
			    e.printStackTrace();   }
      

	}

}
