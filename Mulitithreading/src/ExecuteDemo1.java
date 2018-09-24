import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myapp implements Runnable{

@Override
public void run() {
	// TODO Auto-generated method stub
   perform();	
}
void perform()
{	
	for(int i=0;i<5;i++)
	{
		System.out.println("hello\t"+i+"\t"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
}

public class ExecuteDemo1 {

	public static void main(String[] args) {
		ExecutorService exec=Executors.newFixedThreadPool(5);//new single thread execution
		for(int i=0;i<3;i++)
		{
			exec.execute(new myapp());
		}
		System.out.println("after submitting tasks");
		System.out.println("after for loop");
		exec.execute(new myapp());
		exec.shutdown();// if you dont invoke then jvm will not shutdown
		System.out.println("done");//dont give any task after shutdown
	

	}

}
