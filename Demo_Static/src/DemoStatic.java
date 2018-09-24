
public class DemoStatic {

	private int id;
	private String name;
	private static int counter;
	
	static
	{
		counter=0;
		System.out.println("static block invoked");
	}
    {
    	System.out.println("non static block invoked");
    	
    }
	public DemoStatic()
	{
		id=10;
		name="citi";
		counter++;
		System.out.println("constructor invoked");
	}
	public void display()
	{
		System.out.println("id: "+id+"\tname: "+name+"\tcounter: "+counter);
	}
	public  static void show()
	{
		System.out.println("counter: "+counter);
	}
	

}

class see
{
	public static void main(String[]args) 
	{  
		


		DemoStatic a=new DemoStatic();
		DemoStatic a1=new DemoStatic();
		DemoStatic a2=new DemoStatic();
		DemoStatic a3=new DemoStatic();
		DemoStatic a4=new DemoStatic();
		DemoStatic a5=new DemoStatic();

	}
	
}
