import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(23);
		l.add(6);
		l.add(23);
	
		
		System.out.println("size: "+l.size());
        l.add(2, 200);
        System.out.println("list content: "+l);
        
//        Iterator<Integer>it=l.iterator();
//        while(it.hasNext())
//        {
////        	Object o=it.next();
////        	Integer i=(Integer)o;
//        	System.out.println(it.next());
//        }
        for(Integer i:l)
        {
        	System.out.println(i);
        }
    
       System.out.println("second element is : "+l.get(2));
       System.out.println(l.remove(2));
       System.out.println(l);
       l.remove(new Integer(23));
       System.out.println(l);
	}

}
