
public class Demo_1D {

	public static void main(String[] args) {
		int [] array;
		array=new int[4];
		for(int i=0;i<array.length;i++)
		{
			 array[i]=Integer.parseInt(args[i]);
		}
		for(int i:array)// for each loop
		{
			 System.out.println(i);
		}


	}

}
