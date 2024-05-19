package oops.inhtopic.hi;
import java.util.Scanner;
public class AdminEmployee extends Employee
{
	int commission;
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
		System.out.println("Enter commission : ");
		commission = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name +" " + salary+" " + commission);
	}
	public static void main(String[] args) 
	{
		TechEmployee e = new TechEmployee();
		e.scanData();
		e.dispData();
	}
}
