package oops.abstopic.interfacetopic.task1;


public interface Person 
{
	public static final int no = 100;// 
	
	public abstract void getBehave() ;// public abstract 
	
	static void test1() 
	{
		System.out.println("static void test1()");
	}
	default void test2() 
	{
		System.out.println("default void test2()");
		test3() ;
	}
	private void test3() 
	{
		System.out.println("private void test3()");
	}
}
