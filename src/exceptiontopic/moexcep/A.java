package exceptiontopic.moexcep;

public class A 
{
//	If the superclass method does not declare an exception
//	===> subclass overridden method cannot declare the checked exception 
//		but it can declare unchecked exception.
	
	
	
//	If the superclass method declares an exception
//	===> subclass overridden method can declare same, 
//		subclass exception or 
//		no exception but 
//		cannot declare parent exception.

	public void test() throws Exception
	{
	}
}
