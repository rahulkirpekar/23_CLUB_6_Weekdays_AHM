package multithreaddingtopic.bythreadclass;

// By exnedting Thread class
public class MyThread1 extends Thread
{
	// Thread---job---run() metkhod
	@Override
	public void run() 
	{
//		System.out.println("Hi I am Thread---"+Thread.currentThread().getId()+"----"+Thread.currentThread().getName());

		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println(Thread.currentThread().getName()+" I am Daemon Thread");
		} else 
		{
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
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main Thread.currentThread().getName() : " + Thread.currentThread().getName());
		// main---Thread---CallStack---main function
		
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();

		
		th1.setName("C Language");
		th2.setName("C++ Language");
		th3.setName("Java Language");
		
		
		// th1 create as a Daemon thread
		th1.setDaemon(true);
		
		
		// MIN=1 , NORM =5, MAX=10
		
		th1.setPriority(Thread.MAX_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MIN_PRIORITY);
		
		
		
		// th1--Thread---(Execution Area---CallStack)
		th1.start();
		
		// th1----execution finish
//		try 
//		{
////			th1.join();
//			
//			th1.join(2000);
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		th2.start();
		th3.start();
	}
}
