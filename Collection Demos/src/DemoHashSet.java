import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashSet {

	public static void main(String[] args) {
		Set<String>names=new HashSet<>();
		names.add("Java");
		names.add(".NET");
		names.add("Testing");
		names.add("Spring");
		names.add("Testing");
		System.out.println(names.size());
		names.add("hellokitty");
		System.out.println(names);
		boolean removed=names.remove("Spring");
		if(removed)
		{
			System.out.println("data removed successfully");
		}
		else
		{
			System.out.println("no data found");
		}
		System.out.println(names);
		System.out.println(names.contains(".NET"));
	}

}
