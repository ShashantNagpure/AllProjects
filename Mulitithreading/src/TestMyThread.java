
public class TestMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start inside main "+Thread.currentThread().getName());
		Thread t=new MyThread();
		t.run();
		Thread t1=new MyThread();
		t1.run();
		System.out.println("end: inside main");

	}

}
