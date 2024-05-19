package oops.classobject;
import java.util.Scanner;
//Object
public class Student 
{
	// 1) Data members---[rno name std]
	int rno;//0
	String name;//null
	int std;//0
	// 2) Member function----[scan / disp / totalMarks]
	public void scanData() 
	{
		Scanner sc  = new  Scanner(System.in);
		System.out.println("Enter Rno : ");		
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");		
		name = sc.nextLine();
		System.out.println("Enter Std : ");		
		std = sc.nextInt();
	}
	public  void dispData() 
	{
		System.out.println(rno + " " +name + " " + std);
	}
}