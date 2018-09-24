
public class DemoPriority extends Thread {

	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread running: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts: "+Thread.currentThread().getName());
		Thread t=new DemoPriority();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t.setPriority(MAX_PRIORITY);
		System.out.println("Main ends: "+Thread.currentThread().getName());


	}

}
