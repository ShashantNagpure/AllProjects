
public class MyThread1 extends Thread {
	private int num;
	
	public MyThread1() {num=10;}
	public MyThread1(int num) {this.num=num;}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread running "+Thread.currentThread().getName());
		if(num%2==0)
		{
			System.out.println(num +"is divisible by 2");
		}
		else
		{System.out.println(num+"is not divisible by 2");}
		super.run();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts: "+Thread.currentThread().getName());
		Thread t1=new MyThread1(100);
		Thread t2=new MyThread1(105);
		t1.start();
		t2.start();
		System.out.println("main ends "+Thread.currentThread().getName());
	}

}
