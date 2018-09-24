
public class Employee {
	private int age;
	private String name;
	
	public Employee()
	{
		age=12;name="ABC";
	}
	
	public void setName(String s)
	{
		name=s;
	}
	public void setAge(int a)
	{
		age=a;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void ShowEmployeeDetails()
	{
		System.out.println("age :- "+age+"\tname :- "+name );
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.getAge());
		System.out.println("\n"+e.getName());

	}

}
