package iotopic.byteorientedwau.stringdata;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// wtite to java program 
// read from java file and write in new java file
public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\23_CLUB_6_Weekdays_AHM\\src\\iotopic\\byteorientedwau\\stringdata\\TestApp1.java");
			FileOutputStream fout = new FileOutputStream("TestApp1Club6.java");
			int temp;
			while(	(temp = fin.read())	!=  -1) 
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
			fin.close();
			fout.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
