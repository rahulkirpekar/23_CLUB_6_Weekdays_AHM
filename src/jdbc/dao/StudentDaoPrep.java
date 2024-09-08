package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	public int updateStudent(StudentBean sbean,int rno) 
	{
		String updateQuery = "UPDATE student SET name = ?, std = ?,marks = ?  WHERE rno = ?";

		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0 ;
		if (conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				
				pstmt.setString(1, sbean.getName());
				pstmt.setString(2, sbean.getStd());
				pstmt.setInt(3, sbean.getMarks());
				pstmt.setInt(4, rno);
				
				rowsAffected = pstmt.executeUpdate(); 
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---updateStudent() Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM Student WHERE rno=?";
		
		PreparedStatement pstmt = null;
		
		Connection conn = DBConnection.getConnection();
		
		int rowsAffected = 0 ;
		
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
			
				pstmt.setInt(1, rno);
				
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep ---deleteStudent() Db not connected");
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllStudentRecords() 
	{
		ArrayList<StudentBean> list = new ArrayList<>();
		String selectQuery ="SELECT * from student";
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentBean s = null;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(selectQuery);
			
				rs = pstmt.executeQuery();
				
				while(rs.next()) 
				{
					int rno = rs.getInt(1);
					String name = rs.getString(2);
					String std = rs.getString(3);
					int marks = rs.getInt(4);
					
//					System.out.println(rno+" " + name+" " + std+" " + marks);
				
					s = new StudentBean(rno, name, std, marks);
					
					list.add(s);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDaoPrep---getAllRecords()--Db not connected");
		} 
		return list;
	}
	public static void main(String[] args) 
	{
		StudentDaoPrep dao = new StudentDaoPrep();
		
		ArrayList<StudentBean> list = dao.getAllStudentRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
		
		
		
/*		
		   //------------------DELETE Student---------------------

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Rno : ");
		int rno = sc.nextInt();


		StudentDaoPrep dao = new StudentDaoPrep();

		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student records Deleted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student records not Deleted : " + rowsAffected);
		}	
//----------------UPDATE Student-------------------		

		
		System.out.println("Enter Rno which you want to update : ");
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		String std = sc.nextLine();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
	
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDaoPrep dao = new StudentDaoPrep();

		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student records Updated : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student records not Updated : " + rowsAffected);
		}	
		
/*		
//----------------INSERT Student-------------------		
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
*/		
	}
}
