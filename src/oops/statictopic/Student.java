package oops.statictopic;

import java.util.Scanner;

// DPS --- 1000
public class Student 
{
	private int rno;
	private String name;
	private int std;
	private static String schoolName;
	
	public static void setSchoolName(String schoolName) 
	{
		 Student.schoolName = schoolName;
	}
	public void scanData() 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " +name + " " +std+" "+schoolName+"---"+schoolName.hashCode()+"---"+this);
	}
	public static void main(String[] args) 
	{
//		staticway
		Student.setSchoolName("DPS");
		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		s[3].schoolName = "Meghdoot";// changed for all due to static behaviour
		s[3].rno=100;// changed for s[3] only due to instance variable
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}
	} 
}