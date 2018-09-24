import java.util.Scanner;
public class DemoScanner {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age=sc.nextInt();
		
		System.out.println("enter your percentage: ");
		float per=sc.nextFloat();
		
		System.out.println("your age is : "+age);
		System.out.println("your percentage is : "+per+"%");
		if(age>18)
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("sorry");
		}
	}
}
