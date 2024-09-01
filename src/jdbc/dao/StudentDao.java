package jdbc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.util.DBConnection;

//  Statement(I)
//    |
// StudentDao----Student Table
public class StudentDao 
{
	public void insertStudent() 
	{
		String insertQuery = "INSERT INTO Student(name,std,marks) VALUES('Sagar','8',90)";
		
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
				
				if (rowsAffected > 0) 
				{
					System.out.println("Student records inserted : " + rowsAffected);
					
				} else 
				{
					System.out.println("Student records not inserted : " + rowsAffected);
				}
				
			}catch(SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao :: insertStudent() ---Db not connected");
		}
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
		StudentDao dao = new StudentDao();
		
		dao.insertStudent();
		
		
	}
}
