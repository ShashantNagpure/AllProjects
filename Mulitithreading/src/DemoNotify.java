
public class DemoNotify extends Thread {
	public static int sum=0;
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{sum+=i;}
		synchronized (this) {
			notify();
			
		}
	}

}
