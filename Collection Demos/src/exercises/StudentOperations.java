package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StudentOperations {
	public Map<Integer ,Student> m=new HashMap<>();
	public Student changeName(int rollno,String changeName)
	{
		if(m.containsKey(rollno))
		{
			m.get(rollno).setName(changeName);
			System.out.println("Name change success");
			return m.get(rollno);
		}
		else {System.out.println("Failure"); return null;}
	}
	public Student removeName(int rollno)
	{
		if(m.containsKey(rollno))
		{
			Student s=m.get(rollno);
			System.out.println("removed success");
			m.remove(rollno);
			return s;
		}
		else {System.out.println("Failure"); return null;}
	}
	public List<Student>searchName(String name)
	{
		Set<Entry<Integer,Student>>entryset = m.entrySet();
		Iterator<Entry<Integer,Student>> iterator=entryset.iterator();
		List<Student>l=new ArrayList<>();
		while(iterator.hasNext())
		{
			Entry<Integer,Student>ans = iterator.next();
			if(ans.getValue().getName().equals(name))
			{
				l.add(ans.getValue());
			}
		}
		return l;
	  }
	
	public void printNames()
	{
		Set<Entry<Integer,Student>>entryset = m.entrySet();
		Iterator<Entry<Integer,Student>> iterator=entryset.iterator();
		List<Student>l=new ArrayList<>();
		while(iterator.hasNext())
		{
			Entry<Integer,Student>ans = iterator.next();
			System.out.println(ans.getValue());
		}
	}
	
}
