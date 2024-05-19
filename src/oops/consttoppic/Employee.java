package oops.consttoppic;

public class Employee 
{
	int id;
	String name,dsgn,orgname;
	int salary;
	
	public Employee() 
	{
		System.out.println("Default Constructor---1");
	}
	public Employee(int id,String name,int salary) 
	{
		this();
		System.out.println("Employee(int id,String name,int salary)  Constructor---2");
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Employee(int id,String name,int salary,String dsgn) 
	{
		this(id,name,salary);
		System.out.println("Employee(int id,String name,int salary,String dsgn) Constructor---3");
		this.dsgn=dsgn;
	}
	public Employee(int id,String name,int salary,String dsgn,String orgname) 
	{
		this(id,name,salary,dsgn);
		System.out.println("Employee(int id,String name,int salary,String dsgn,String orgname)Constructor---4");
		this.orgname=orgname;
	}
	public void disp() 
	{
		System.out.println(id +" "+name+" " + salary+" "+dsgn+" " + orgname);
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1, "rahul", 1200, "SE", "abc");
		e1.disp();
	}
}