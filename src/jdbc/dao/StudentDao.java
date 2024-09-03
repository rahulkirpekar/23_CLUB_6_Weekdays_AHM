package jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
	public int updateStudent(StudentBean sbean,int rno) 
	{
		String updateQuery = "UPDATE student SET name = '"+sbean.getName()+"', std = '"+sbean.getStd()+"',marks = "+sbean.getMarks()+"  WHERE rno =" + rno;

		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0 ;
		if (conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(updateQuery); 
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---updateStudent() Db not connected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int rno) 
	{
		String deleteQuery = "DELETE FROM Student WHERE rno="+rno;
		
		System.out.println("deleteQuery : " + deleteQuery);
		
		Statement stmt = null;
		
		Connection conn = DBConnection.getConnection();
		
		int rowsAffected = 0 ;
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDoa ---deleteStudent() Db not connected");
		}
		return rowsAffected;
	}
	public ArrayList<StudentBean> getAllStudentRecords() 
	{
		ArrayList<StudentBean> list = new ArrayList<>();
		String selectQuery ="SELECT * from student";
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		StudentBean s = null;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rs = stmt.executeQuery(selectQuery);
				
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
			System.out.println("StudentDaio---getAllRecords()--Db not connected");
		} 
		return list;
	}
	public static void main(String[] args) 
	{
		StudentDao dao = new StudentDao();
		
		ArrayList<StudentBean> list = dao.getAllStudentRecords();
		
		for (int i = 0; i < list.size(); i++) 
		{
			StudentBean s = list.get(i);
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd()+" " + s.getMarks());
		}
/*
  		-------------------------Update Student-----------------------------
		Scanner sc= new Scanner(System.in);
		
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
		
		StudentDao dao = new StudentDao();

		int rowsAffected = dao.updateStudent(sbean,rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student records Updated : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student records not Updated : " + rowsAffected);
		}	
/*
   //------------------DELETE Student---------------------

		System.out.println("Enter Rno : ");
		int rno = sc.nextInt();


		StudentDao dao = new StudentDao();

		int rowsAffected = dao.deleteStudent(rno);
		
		if (rowsAffected > 0) 
		{
			System.out.println("Student records Deleted : " + rowsAffected);
			
		} else 
		{
			System.out.println("Student records not Deleted : " + rowsAffected);
		}		
//------------------INSERT Student---------------------
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
*/		
	}
}
