package collectiontopic.settopic;

import java.util.Iterator;
import java.util.ArrayList;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul"); // JVM---[int--->Integer object]---[AUTO-BOXING]
		list.add("ramesh");
		list.add("sagar");
		list.add("nilesh");
		list.add("kamal");
		list.add("ramesh");
		list.add("sagar");
		list.add("nilesh");

		Iterator<String> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			//object to primi value---[UNBOXING]
			String name = itr.next();
			
			System.out.println(name);
		}
		
	}

}
