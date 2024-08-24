package collectiontopic.listtopic;

import java.util.LinkedList;
import java.util.Iterator;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul",12);
		Student s2 = new Student(2, "kunal",12);
		Student s3 = new Student(3, "rakesh",11);
		Student s4 = new Student(4, "ankur",11);
		Student s5 = new Student(5, "ketan",10);
	
		LinkedList<Student>list = new LinkedList<Student>();
		
		list.add(s1); // JVM---[int--->Integer object]---[AUTO-BOXING]
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Iterator<Student> itr =	list.iterator();
		
		while (itr.hasNext()) 
		{
			//object to primi value---[UNBOXING]
			Student s = itr.next();
			
			System.out.println(s.getRno()+" " + s.getName()+" " + s.getStd());
		}
	}
}
