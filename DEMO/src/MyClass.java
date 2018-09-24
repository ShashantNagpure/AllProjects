
public class MyClass {
	private int age;
	private float percentage;
	private String name;
	private double Salary;
	private boolean IsUnemployed;
	public void display()
	{
		System.out.println("age :- "+age+"\tname :- "+name+"\tsalary :- "+Salary );
	}
	public MyClass() 
	{
		age=100;
		percentage=12.12f;
		name="CITI";
		Salary=10000;
		IsUnemployed=true;
		
	}
	public MyClass(int age,float percentage,String name,double salary,boolean IsUnemployed) 
	{
		this.age=age;
		this.percentage=percentage;
		this.name=name;
		this.Salary=salary;
		this.IsUnemployed=IsUnemployed;
		
	}
	public static void main(String[] args) {
	    
		MyClass m=new MyClass();
		m.display();
		
		m=new MyClass(23,98.23f,"Shashant",12d,false);
		m.display();


	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public boolean isIsUnemployed() {
		return IsUnemployed;
	}
	public void setIsUnemployed(boolean isUnemployed) {
		IsUnemployed = isUnemployed;
	}


}
