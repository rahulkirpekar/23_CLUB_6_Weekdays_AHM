package multithreaddingtopic.bythreadclass.task1;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		
		MyThread1 t1 = new MyThread1(resource);
		MyThread1 t2 = new MyThread1(resource);
		MyThread1 t3 = new MyThread1(resource);
		
		
		t1.start();
		t2.start();		
		t3.start();
	}
}
