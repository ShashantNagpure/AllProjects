
public class DemoRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread running: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable r=new DemoRunnable();
        //r.start();
        Thread t= new Thread(r);
        t.start();
	}

}
