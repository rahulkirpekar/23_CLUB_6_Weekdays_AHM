package collectiontopic.settopic;

import java.util.Iterator;
import java.util.TreeSet;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		TreeSet<String>setObj = new TreeSet<String>();
		
		setObj.add("rahul"); 
		setObj.add("ramesh");
		setObj.add("sagar");
		setObj.add("nilesh");
		setObj.add("kamal");
		setObj.add("ramesh");
		setObj.add("sagar");
		setObj.add("nilesh");

		Iterator<String> itr =	setObj.iterator();
		
		while (itr.hasNext()) 
		{
			String name = itr.next();
			
			System.out.println(name);
		}
	}
}
