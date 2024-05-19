package oops.accessmoditopic.pack2;

import oops.accessmoditopic.pack1.Student;

public class OutSidePackageChildClass extends Student
{
	public static void main(String[] args) 
	{
		OutSidePackageChildClass s = new OutSidePackageChildClass();
		
		s.rno=1;
		s.name="rahul";
		s.std=12;
		
	}
}
