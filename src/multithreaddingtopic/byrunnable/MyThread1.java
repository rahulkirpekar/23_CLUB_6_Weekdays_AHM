package multithreaddingtopic.byrunnable;

public class MyThread1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Hi I am Thread----" + Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		MyThread1 th1 = new MyThread1();
		MyThread1 th2 = new MyThread1();
		MyThread1 th3 = new MyThread1();
		
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);

		
		
		t1.start();//Thread
		t2.start();//Thread
		t3.start();//Thread
	}
}
