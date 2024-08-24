package iotopic.charorientedway;

import java.io.FileReader;
import java.io.IOException;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder();
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\23_CLUB_6_Weekdays_AHM\\list1.txt");
			
			int temp;
			
			while((temp = fr.read())	!= -1) 
			{
				sb.append((char)temp);
			}
			fr.close();
		} catch (IOException e) 
		{	
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb);
	}
}
