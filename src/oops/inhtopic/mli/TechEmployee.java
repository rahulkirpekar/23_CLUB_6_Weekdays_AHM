package oops.inhtopic.mli;
import java.util.Scanner;
//MultiLevel Inheritance
public class TechEmployee extends Employee
{
	int bonus;
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		System.out.println("Enter Bonus : ");
		bonus = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name +" " + salary+" " + bonus);
	}
	public static void main(String[] args) 
	{
		TechEmployee e = new TechEmployee();
		
		e.scanData();
		e.dispData();
	}
}
