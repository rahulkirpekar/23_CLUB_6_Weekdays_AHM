package collectiontopic.sortingtech.primsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		list.add(5);
//		list.add(4);
//		list.add(3);
//		list.add(2);
//		list.add(1);
//		list.add(15);
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Rahul"); 
		list.add("Ankur"); 
		list.add("Brijesh"); 
		list.add("Sagar"); 
		list.add("Kunal"); 
		list.add("Meet");
		
		Iterator<String> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		// sorting in Ascesnding order
		Collections.sort(list);
		
		System.out.println("After Sorting : "); 
		
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}














