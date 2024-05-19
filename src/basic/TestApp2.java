package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		Declaration:-
//		----------------
			int a[] = new int[5];
			
//			System.out.println("a.length : " + a.length);// a.length--operator---array size
			
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("Enter A["+i+"] : ");
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("Enter A["+ i +"] : "+a[i]);
			}
			
//			String name="rahul";
//			System.out.println(name.length());
			
//			int[] a = new int[5];
//			int []a = new int[5];
//			int [] a = new int[5];

//			int a[] = null;
//			a = new int[5];


//		Declaration WITH Initialisation:-
//		----------------------------------

//				int a[] = new int[]{10,20,30,40};
//				int a[] = {10,20,30,40};

		
	}
}
