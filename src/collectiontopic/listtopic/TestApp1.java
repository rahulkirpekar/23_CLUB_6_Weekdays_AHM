package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add(true);//0 <===itr
		list.add(12);//1
		list.add('r');//2
		list.add(142L);//3
		list.add(42.324f);//4
		list.add(23243.2134);//5
		list.add("rahul");//6
		Student s= new Student(1, "kunal", 12);
		list.add(s);//7

		System.out.println("list.size() : " + list.size());
		System.out.println("list.get(0) : " + list.get(0));
		
/*		for(int i = 0 ; i < list.size() ; i++) 
		{
			Object obj = list.get(i);
			
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" "  + s1.getName()+" " + s1.getStd());
			}else
			{
				System.out.println(obj); 
			}
		}
*/		
		//---------------------------------------------------------
		// Advanced fo..loop / Enhanced for ..looop / For Each loop
/*		for(Object obj : list) 
		{
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" "  + s1.getName()+" " + s1.getStd());
			}else
			{
				System.out.println(obj); 
			}
		}
*/		
		//---------------------------------------------------------
		// Traditional way to iterate list obj
		Iterator itr =	list.iterator();
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			if (obj instanceof Student) 
			{
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" "  + s1.getName()+" " + s1.getStd());
			}else
			{
				System.out.println(obj); 
			}
		}
	}
}