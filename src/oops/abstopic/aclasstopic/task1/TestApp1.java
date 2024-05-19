package oops.abstopic.aclasstopic.task1;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For School");
		System.out.println("2) For Org");
		System.out.println("3) For PublicPlace");
		int choice = sc.nextInt();
		
		Person p = null;
		
		switch(choice ) 
		{
					// Polymorphic object--Runtime Polymorphism
					// Parent ref = Child obj;
			case 1: p = new School();
					p.getBehave();
					
					
					// Downcasting--[Parent reference---convert into Child object]
					School s = (School)p;
					s.getResult();
					
					break;
					
			case 2: p = new Org();
					p.getBehave();
					
					Org o = (Org)p;
					o.getTask();
					break;
					
			case 3: p = new PublicPlace();
					p.getBehave();
					
					PublicPlace pobj = (PublicPlace)p;
					pobj.getEvent();
					break;
		}
	}
}