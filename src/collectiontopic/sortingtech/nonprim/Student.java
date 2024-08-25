package collectiontopic.sortingtech.nonprim;

public class Student //implements Comparable<Student>
{
	int rno;
	String name;
	int std;
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public void disp() 
	{
		System.out.println(rno+" " + name+ " " + std);
	}
	// Define sorting defination---stdwise
/*	@Override
	public int compareTo(Student s2) 
	{
		if(std > s2.std) 
		{
			return 1;
			
		}else if(std < s2.std) 
		{
			return -1;
			
		}else 
		{
			return 0;
		}
	}
*/
//	@Override
//	public int compareTo(Student s2) 
//	{
//		return name.compareTo(s2.name);
//	}
}















