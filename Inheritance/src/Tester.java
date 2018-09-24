import java.nio.channels.NetworkChannel;
import java.util.Scanner;

import com.beans.EngineeringStudent;
import com.beans.Student;
import com.myinterfaces.MyCalculation;

public class Tester {

	public static void main(String[] args) {
		MyCalculation m= new MyCalculation() {
			
			@Override
			public String showGrade(double percentage) {
				if(percentage>40) {return "Pass";}
				else return "Fail";
			}
			
			@Override
			public double percentage(int add) {
				double x=add/3;
				return x;
			}
			
			@Override
			public int addition(Student a) {
				int res=0;
				for(int q:((EngineeringStudent)a).marks)
				{res+=q;}
				return res;
			}
		};
		 
//		Student[]arr=new Student[1];
//		int []lop= {92,67,89};
//
	//	arr[0]=new EngineeringStudent(lop,"IIT","elec", 123,"Shas", 12);
//		
//		System.out.println(m.addition(arr[0]));
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of student: ");
		int n=in.nextInt();
		Student[]arr=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks of student"+i+" :");
			int[]marks=new int[3];
			for(int j=0;j<3;j++)
			{
				marks[j]=in.nextInt();
				
			}
			//String x=in.nextLine();
			System.out.println("Enter College name : ");
			String clg=in.next();
			System.out.println("Enter Dept name : ");
			String dpt=in.next();
			System.out.println("Enter roll no : ");
			int roll_no=in.nextInt();
			System.out.println("Enter  name : ");
			String name=in.next();
			System.out.println("Enter ID : ");
			int id=in.nextInt();
			
			arr[i]=new EngineeringStudent(marks,clg,dpt, roll_no, name,id);
		}
		for(int i=0;i<n;i++)
		{
			((EngineeringStudent)arr[i]).display();
			System.out.println(m.addition(arr[i])+"  "+m.percentage(m.addition(arr[i])));
		}
		
		
		};

	}
