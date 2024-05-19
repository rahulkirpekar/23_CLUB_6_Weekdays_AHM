package oops.polymorphism.compiletime;

public class TestApp1 
{
	// Method Overloadding
	static void addFun()
	{
		System.out.println("addFun()");
	}
	static void addFun(double no1,double no2)
	{
		System.out.println("addFun(double no1,double no2)");
	}
	static void addFun(float no1,float no2)
	{
		System.out.println("addFun(float no1,float no2)");
	}

	static void addFun(int no1,int no2,int no3)
	{
		System.out.println("addFun(int no1,int no2,int no3)");
	}
	static void addFun(int no1,int no2,int no3,int no4)
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4)");
	}
	public static void main(String[] args) 
	{
		// Static Binding
		TestApp1.addFun(20, 10);
	}
}

// 1) arg count
// 2) exact datatype match
// 3) type pramotion rule

//Type pramotion Rule
//-------------------
//boolean---X
//
//	byte
//	 |
//	short
//	 |
//char------------------->int
//	 |
//	long
//	 |
//	float
//	 |
//	double
