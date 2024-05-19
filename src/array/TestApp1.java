package array;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};

//--------Standard for loop
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println("a["+i+"] : " + a[i]);
//		}
//--------Enhanced/for each / Advanced for loop 		
		
		for( int value :  a ) 
		{
			System.out.println(value);
		}
	}
}
