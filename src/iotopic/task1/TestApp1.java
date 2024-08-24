package iotopic.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\23_CLUB_6_Weekdays_AHM\\src\\iotopic\\task1\\TestApp1.java");
			
			FileOutputStream fout = new FileOutputStream("TestApp1.java");
			
			int temp ;
			while(	(temp = fin.read())	!= -1) 
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
			fout.close();
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
