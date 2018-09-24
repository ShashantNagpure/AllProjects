
public class StudentDetails {
 private int rollno;
 private String name;
 private static String institute;
 static
 {
	 institute="ABC COLLEGE";
 }
 public StudentDetails(int rollno,String name) {
	 this.rollno=rollno;
	 this.name=name;
 }
 public void display()
 {
	 System.out.println(rollno+" "+name+" "+institute);
 }
	public static void main(String[] args) {
		StudentDetails s=new StudentDetails(2,"mukesh");
		s.display();
	}

}
