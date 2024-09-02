package jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

//  Statement(I)
//    |
// StudentDao----Student Table
public class StudentDao 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO Student(name,std,marks) VALUES('"+sbean.getName()+"','"+sbean.getStd()+"',"+sbean.getMarks()+")";
		
		System.out.println("insertQuery : " + insertQuery);
		
		int rowsAffected =  0;
		
		Statement stmt = null;
		
		// 1) Get DBConnection object
		Connection conn = DBConnection.getConnection();
		
		// 2) validate conn object
		if (conn!=null) 
		{
			try 
			{
				// 3) create statement object by conn
				stmt = conn.createStatement();

				rowsAffected = stmt.executeUpdate(insertQuery);
				
			}catch(SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao :: insertStudent() ---Db not connected");
		}
		return rowsAffected;
	}
	public void updateStudent() 
	{
	}
	public void deleteStudent() 
	{
	}
	public void getAllStudentRecords() 
	{
	}
	public static void main(String[] args) 
	{
//------------------INSERT Student---------------------
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student records inserted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student records not inserted : " + rowsAffected);
		}
	}
}
