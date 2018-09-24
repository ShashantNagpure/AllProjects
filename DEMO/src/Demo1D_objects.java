
public class Demo1D_objects {
	public static void main(String[]args)
	{
		MyClass[] objs ;
		objs =new MyClass[3];
		objs[0]=new MyClass();
		objs[1]=new MyClass(12,89.90f,"abcd",20000,true);
		objs[2]=new MyClass(22,99.90f,"xyz",0,false);
		for(MyClass a:objs)
		{
			a.display();
			
		}

		
		
	}

	

}
