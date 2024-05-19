package oops.inhtopic.aggre;
// Has-A relation - Aggregation
public class Employee 
{
	int id,salary;
	String name;
	Address add = null;

	public Employee() 
	{
	}
	public Employee(int id, int salary, String name, Address add) 
	{
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.add = add;
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary+" " + add.city+" " + add.state);
	}
	public static void main(String[] args) 
	{
		Address add1 = new Address("Ahm", "Guj");
		Address add2 = new Address("Bombay", "Mh");
		Address add3 = new Address("Jaipur", "Rj");
		
		Employee e1 = new Employee(1, 1200, "ABC", add1);
		Employee e2 = new Employee(2, 2200, "DEF", add2);
		Employee e3 = new Employee(3, 3200, "GHI", add3);
		
		e1.dispData();
		e2.dispData();
		e3.dispData();
	}
}
