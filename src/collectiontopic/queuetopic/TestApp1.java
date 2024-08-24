package collectiontopic.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natrual Oredering
		PriorityQueue<String>queueObj = new PriorityQueue<String>();
		
		queueObj.add("rahul");
		queueObj.add("ramesh");
		queueObj.add("sagar");
		queueObj.add("nilesh");
		queueObj.add("kamal");
		
		while(!queueObj.isEmpty()) 
		{
			String name = queueObj.poll();
			System.out.println(name);
		}
	}
}
