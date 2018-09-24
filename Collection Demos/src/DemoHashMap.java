import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		Map<String,Integer>data=new HashMap<>();
		data.put("A", 0);
		data.put("One",890);
		data.put("X",500);
		data.put("X", 23123);
		data.put("Y", 1221);
		System.out.println(data.size());
		System.out.println(data);
		Set<Entry<String, Integer>>entryset=data.entrySet();
		Iterator<Entry<String,Integer>> iterator=entryset.iterator();
		while(iterator.hasNext())
		{
			Entry<String,Integer> ans=iterator.next();
			System.out.println(ans.getKey()+" : "+ans.getValue());
		}
	}

}
