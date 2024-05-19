package oops.consttoppic;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	// default Constructor
	Student()
	{
		System.out.println("START :: Default Constructor---------------------------"+this);
		System.out.println("Before Default Constructor  : " + rno + " " +name + " " +std);
		rno = 1;
		name = "rahul";
		std = 12;
		System.out.println("AFTER Default Constructor  : " + rno + " " +name + " " +std);
		System.out.println("EXIT :: Default Constructor");
	}	
	// para constructor
	Student(int rno,String name,int std)
	{
		System.out.println("START :: para Constructor---------------------------"+this);
		this.rno = rno;
		this.name = name;
		this.std = std;
		System.out.println("EXIT :: para Constructor");
	}
	// copy constructor
	Student(Student s)
	{
		System.out.println("START :: copy Constructor---------------------------"+this);
		rno = s.rno;
		name = s.name;
		std = s.std;
		System.out.println("EXIT :: copy Constructor");
	}
	public void dispData() 
	{
		System.out.println(rno + " " +name + " " +std+"---------------------------"+this);
	}
	public static void main(String[] args) 
	{
		Student obj1 = new Student(1,"Rajesh",12);// obj---[rno name std]
		
		obj1.dispData();
		
//		Student obj2 = new Student(obj1);
//		obj2.dispData();
	} 
}