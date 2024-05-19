package basic;

// convention---------------->Rule
// coreJava--->JspServlet---->Spring
public class TestApp1 
{
	public static void main(String[] args) 
	{
		int primeCount = 0;
		int l=2,m,no;
		boolean flag = true;
		for (int i = 1; i <=5; i++) 
		{
			for(int k = (5-i);k>=1;k--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;) 
			{
				no = l;
				flag = true;
				for(m = 2 ; m < no ; m++) 
				{
					if(no % m == 0) 
					{
						flag=false;
						break;
					}	
				}
				if(flag) 
				{
					System.out.print(no+" ");
					j++;
					primeCount++;
				}
				l++;
			}
			System.out.println();
		}
		for (int i = 4; i >=1; i--) 
		{
			for(int k = (5-i);k>=1;k--) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;) 
			{
				no = l;
				flag = true;
				for(m = 2 ; m < no ; m++) 
				{
					if(no % m == 0) 
					{
						flag=false;
						break;
					}	
				}
				if(flag) 
				{
					System.out.print(no+" ");
					j++;
					primeCount++;
				}
				l++;
			}
			System.out.println();
		}
		
		System.out.println("Total Prime Used in Diamond is : " + primeCount);
	}
}
