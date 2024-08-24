package iotopic.byteorientedwau.stringdata;

import java.io.FileInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\23_CLUB_6_Weekdays_AHM\\club61.txt");

			int temp;
			
			while(	(temp = fin.read())	!= -1) 
			{
				sb.append((char)temp);
			}
			fin.close();
		
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}
