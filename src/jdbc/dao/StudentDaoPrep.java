package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.bean.StudentBean;
import jdbc.util.DBConnection;

// PreparedStatement---CRUD
public class StudentDaoPrep 
{
	public int insertStudent(StudentBean sbean) 
	{
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES(?,?,?)";
		
		Connection conn = DBConnection.getConnection();
		
		PreparedStatement pstmt = null;
		
		int rowsAffected = 0 ;
		if (conn!=null)
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);

				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				
				rowsAffected = pstmt.executeUpdate();
				
			}catch(SQLException e) 
			{
				e.printStackTrace();	
			}
		} else 
		{
			System.out.println("StudentDaoPrep :: insertStudent() Db not connetced");
		}
		return rowsAffected;
	}
	public void updateStudent() 
	{

	}
	public void deleteStudent() 
	{

	}
	public void getAllrecords() 
	{

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		
		StudentDaoPrep dao = new StudentDaoPrep();

		
		int rowsAffected = dao.insertStudent(sbean);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		} else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
		}
	}
}
