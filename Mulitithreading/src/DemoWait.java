
public class DemoWait  {

	public static void main(String[] args) {
		DemoNotify t1=new DemoNotify();
		t1.start();
		//System.out.println("sum is "+t1.sum);
		
			try {
				synchronized (t1) {
				t1.wait();
				System.out.println("sum is : " +t1.sum);}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			
			
		
	}

}
