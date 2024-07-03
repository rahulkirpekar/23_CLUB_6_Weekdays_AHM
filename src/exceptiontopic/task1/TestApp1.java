package exceptiontopic.task1;

import java.io.IOException;
import java.util.Scanner;

public class TestApp1 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// raise exception ==> "throw"
			
			// UnChecked Exception
//			throw new ArithmeticException("Invalid Age , \n\t\tPlease enter valid Age");

			// Checked Exception
			throw new InvalidAgeException("Invalid Age , \n\t\tPlease enter valid Age");

		} else 
		{
			System.out.println("Welcome For Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Vote : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
			
		} catch (InvalidAgeException e) 
		{
			e.printStackTrace();
		
		}// code crashed---JVM
		
		System.out.println("General Statement");
		// code--execute---TRUE
	}
}
