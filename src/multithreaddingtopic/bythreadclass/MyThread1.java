package multithreaddingtopic.bythreadclass;

// By exnedting Thread class
public class MyThread1 extends Thread
{
	// Thread---job---run() metkhod
	@Override
	public void run() 
	{
//		System.out.println("Hi I am Thread---"+Thread.currentThread().getId()+"----"+Thread.currentThread().getName());
		
		for (int i = 1; i <=5; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"----"+i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main Thread.currentThread().getName() : " + Thread.currentThread().getName());
		// main---Thread---CallStack---main function
		
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();

		// th1--Thread---(Execution Area---CallStack)
		th1.start();
		th2.start();
		th3.start();
		
	}
}
