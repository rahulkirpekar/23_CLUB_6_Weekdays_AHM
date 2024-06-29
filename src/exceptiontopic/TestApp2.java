package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		try 
		{
			// exception ---handle---[Exception Handling]---[try...catch]
			ans = no1 / no2;
			
			String name = "rahul";
			System.out.println("name.length() : " + name.length());
			
			int a[] = new int[5];
			a[5]=10;
			
		}catch(ArithmeticException	e) 
		{
			e.printStackTrace();
			System.out.println("In Catch Block--ArithmeticException -- Exception Hanlded");
		}
		catch(NullPointerException	e) 
		{
			e.printStackTrace();
			System.out.println("In Catch Block---NullPointerException -- Exception Hanlded");
		}
		catch(ArrayIndexOutOfBoundsException	e) 
		{
			e.printStackTrace();
			System.out.println("In Catch Block---ArrayIndexOutOfBoundsException -- Exception Hanlded");
		}
		
		System.out.println("Addition : " + ans);
	}
}