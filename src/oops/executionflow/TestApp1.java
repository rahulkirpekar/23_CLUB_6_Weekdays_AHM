package oops.executionflow;

// Execution Flow of class
public class TestApp1 
{
	// Static Block
	static
	{
		System.out.println("Static Block--2");
	}
	static
	{
		System.out.println("Static Block--1");
	}
	
	// Instance Block	
	{
		System.out.println("Instance Block---5");
	}
	// Instance Block	
	{
		System.out.println("Instance Block---4");
	}
	
	// Default Constructor
	public TestApp1() 
	{
		System.out.println("Default Constructor---6");
	}
	// Para Constructor
	public TestApp1(int no1) 
	{
		System.out.println("Para Constructor---6");
	}
	// static method
	static void tes1() 
	{
		System.out.println("static test1()--method---3");
	}
	// non-static method	
	void tes2() 
	{
		System.out.println("NonStatic test2()--method---6");
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: MAIN method---2");
		
		TestApp1.tes1();
		
		TestApp1 obj = new TestApp1(10);
		obj.tes2();
		
		System.out.println("EXIT :: MAIN method---7");
	}
}
