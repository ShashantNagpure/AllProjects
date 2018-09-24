
public class Employees {
	private int empId;
	private String empName;
	static private int empCount;
	static
	{
		empCount=0;
	}
	public Employees(String empName,int empId)
	{
		empCount++;
		this.empId=empId;
		this.empName=empName;
		
	}
	public Employees()
	{
		empCount++;
		this.empId=empId;
		this.empName=empName;
	}
	public void showCount()
	{
		System.out.println("count is : "+empCount);
	}
	public void displayEmployee()
	{
		System.out.println("Name : "+empName+"\tID : "+empId);
		
	}
	public static void main(String[] args) {
		
		Employees a=new Employees("john",24);
		a.showCount();
		Employees d=new Employees("smith",102);
		a.showCount();
		Employees c=new Employees("ryan",214);
		a.showCount();
		Employees b=new Employees("mary",242);
		a.showCount();
		a.displayEmployee();
		b.displayEmployee();
		c.displayEmployee();
		d.displayEmployee();
		a.showCount();

	}
	
	

}
