package stringtopic.immutable;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
//		String stmt = String.format("This is Java which is developed by James gosling in Java %d datatype", 8);

		String stmt = "abcd";
		
		byte b[] = stmt.getBytes();
		
		for (int i = 0; i < b.length; i++) 
		{
			System.out.println(stmt.charAt(i)+"-----"+b[i]);
		}
		
//		System.out.println("stmt : " + stmt);
		
		
//		String name1 = "royal";
//		String name2 = "Royal";

		
//		System.out.println(name1.equals(name2));// false
//		System.out.println(name1.equalsIgnoreCase(name2));//true
		
		
//		System.out.println(name1.endsWith("org"));// true
		
//		System.out.println(name1.contains("Org"));// true
//		String name2 = "techno";

//		String name3 = name1.concat(name2);
//		System.out.println(name1);
//		System.out.println(name2);
//		System.out.println(name3);
		
//		System.out.println("name1.equals(name2) : " + name1.equals(name2));// true
//		System.out.println("name1.compareTo(name2) : " + name1.compareTo(name2));// 0
		
		
	}
}
