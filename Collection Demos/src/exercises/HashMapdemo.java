package exercises;

import java.util.ArrayList;
import java.util.List;

public class HashMapdemo {

	public static void main(String[] args) {
		StudentOperations op=new StudentOperations();
		op.m.put(12,new Student(12, 21, "shashant"));
		op.m.put(11,new Student(11, 21, "shashant1"));
		op.m.put(10,new Student(10, 21, "shashant2"));
		op.m.put(9,new Student(9, 21, "shashant3"));
		op.m.put(8,new Student(8, 21, "shashant"));
		op.printNames();
		op.changeName(10, "arvind");
		op.printNames();
		List<Student>s=new ArrayList<>();
		s=op.searchName("shashant");
		System.out.println(s);
		op.removeName(9);
		op.printNames();

	}

}
