import java.lang.Math;
public class OverloadProgram {
	
	public void area (double parameter,boolean issquare )
	{
		double x=Math.pow(parameter, 2.0);
		if(issquare)
		{	
		    System.out.println("Area of Square is : "+ x);
		}
		else
		{
			double y=3.14*x;
			System.out.println("Area of Circle is : "+ y);
		}
			
	}
	public void area (double w,double h,boolean isRect )
	{
		double x=w*h;
		if(isRect)
	   
		{System.out.println("Area of Rectangle is : "+ x);}
		else
		{
			x=x*0.5;
			System.out.println("Area of Triangle is : "+ x);
		}
			
	}

	public static void main(String[] args) {
		OverloadProgram ob=new OverloadProgram();
		ob.area(4, true);
		ob.area(4, false);
		ob.area(4, 2,true);
		ob.area(4, 2,false);


	}

}
