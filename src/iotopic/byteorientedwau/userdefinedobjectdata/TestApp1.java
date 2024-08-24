package iotopic.byteorientedwau.userdefinedobjectdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		
		// s1--object---write--into---file
		try 
		{
			FileOutputStream fout = new FileOutputStream("studentrecd.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			
			out.close();
			fout.close();
			
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}