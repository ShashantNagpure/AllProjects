package exercises;

import java.util.ArrayList;
import java.util.List;

public class StudentsortDemo {
 public static void main(String[] args) {
	List<Student> arr=new ArrayList<>();
	arr.add(new Student(123, 21, "Shash"));
	arr.add(new Student(4, 20,"Harish"));
	arr.add(new Student(123, 34, "govind"));
	arr.sort(null);
	System.out.println(arr);
}
}
