package stringtopic.mutable;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("royal");
		StringBuilder sb2 = new StringBuilder("techno");
		
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);
		
		// mutable--changable
		sb1.append(sb2);
		
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);
	}
}
