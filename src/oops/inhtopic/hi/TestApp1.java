package oops.inhtopic.hi;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter below choice: ");
		int choice = sc.nextInt();
		
		switch (choice) 
		{
			case 1: AdminEmployee a = new AdminEmployee();
					a.scanData();
					a.dispData();
					break;
					
			case 2: TechEmployee t = new TechEmployee();
					t.scanData();
					t.dispData();
					break;
		}
	}
}
