package innerclasstopic.mi;

public class A 
{
	private int no = 10;
	
	// Member Innerclass
	class B
	{
		void disp() 
		{
			System.out.println("B : disp() No : " + no);
		}	
	}
	public static void main(String[] args) 
	{
		A objA = new A();
		
		A.B  objB =	objA.new B();
		
		objB.disp();
	}
}
