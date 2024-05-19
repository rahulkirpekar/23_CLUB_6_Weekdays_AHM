package oops.encaptopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		
		e.setId(1);
		e.setName("Sanjay");
		e.setSalary(1222);
		
		System.out.println(e.getId()+" " + e.getName()+" " +e.getSalary());
	}
}
