package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		// Nested try...catch
		try 
		{
			
			try 
			{
				String val = "royal";
				System.out.println(val.charAt(val.length()));

			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			
			try 
			{
				// exception ---handle---[Exception Handling]---[try...catch]
				ans = no1 / no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = "rahul";
				System.out.println("name.length() : " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				int a[] = new int[5];
				a[5]=10;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}finally 
			{
				System.out.println("Inner finally block");
			}
			
		}catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException	e) 
		{
			e.printStackTrace();
			System.out.println("In Catch Block--ArithmeticException -- Exception Hanlded");
		}
		catch(Exception e) 
		{
			System.out.println("Handled by Exception class");
			e.printStackTrace();
		}finally 
		{
			System.out.println("Outer finally block");
		}
		
		System.out.println("Addition : " + ans);
	}
}