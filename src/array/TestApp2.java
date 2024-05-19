package array;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		int a[][] = new int[5][3];
//		int[][] a = new int[5][3];
//		int [][]a = new int[5][3];
//		int []a[] = new int[5][3];
//		int [][] a = new int[5][3];
//		---------------------------------
//		int a[][] = null;
//		a = new int[5][3];

		Scanner sc = new Scanner(System.in); 

		int a[][] = new int[5][3];
		
		for(int i = 0 ; i < a.length ; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < a.length ; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}