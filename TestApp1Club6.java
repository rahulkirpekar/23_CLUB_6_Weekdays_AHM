package iotopic.byteorientedwau.stringdata;

import java.io.FileOutputStream;
import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		try 
		{
			FileOutputStream fout = new FileOutputStream("club61.txt");
			
			// String data == byte
			
			byte b[] = name.getBytes();
			
			fout.write(b);
			
			fout.close();
			
			System.out.println("Success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
