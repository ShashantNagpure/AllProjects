
public class Operator {
	
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		char op= args[2].charAt(0);
		System.out.println(op);
		System.out.println(a);
		System.out.println(b);
	     if(op=='+') {int r=a+b;System.out.println(r);}
		 if (op=='-') {int r=a-b;System.out.println(r);}
		 if (op=='*') {int r=a*b;System.out.println(r);}
		 if(op=='/') {int r=a/b;System.out.println(r);}
		}

}
