package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<String>t=new TreeSet<>();
		InputStreamReader input =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		//System.out.println("Please enter your name: ");
		try {
			System.out.println("Enter number of products: ");
			int n=Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++)
			{
				t.add(br.readLine());
			}
		Iterator<String> it=t.iterator();
		while(it.hasNext())
		{
			String a=it.next();
			System.out.println(a);
		}
		System.out.println("size of set is : "+ t.size());
		System.out.println("Enter product name you want to delete: ");
		String s=br.readLine();
		t.remove(s);
		it=t.iterator();
		while(it.hasNext())
		{
			String a=it.next();
			System.out.println(a);
		}
		

		
		}
		catch (IOException e) {
			e.printStackTrace();   
			// TODO: handle exception
		}

	}

}
