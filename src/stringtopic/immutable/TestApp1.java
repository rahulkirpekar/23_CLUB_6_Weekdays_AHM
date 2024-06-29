package stringtopic.immutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "royal";
		String name2 = "techno";
		
		System.out.println("Name1 : " + name1);
		System.out.println("Name2 : " + name2);
		
		//royaltechno
		name1 = name1.concat(name2);
		
		System.out.println("Name1 : " + name1);
		System.out.println("Name2 : " + name2);
	}
}
