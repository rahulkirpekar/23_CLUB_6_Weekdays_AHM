package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Typesafe -- Generics
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(10); // JVM---[int--->Integer object]---[AUTO-BOXING]
		list.add(20);
		list.add(32);
		list.add(4543);
		list.add(3432);

		Iterator<Integer> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			//object to primi value---[UNBOXING]
			int value = itr.next();
			
			System.out.println(value);
		}
		
//		list---mix
	} 

}
