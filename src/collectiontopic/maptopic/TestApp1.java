package collectiontopic.maptopic;

import java.util.HashMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> mapObj = new HashMap<Integer,String>();

		//         [K,V]---ENTRY
		mapObj.put(4, "sagar");
		mapObj.put(5, "kunal");
		mapObj.put(2, "ankur");
		mapObj.put(1, "rahul");
		mapObj.put(3, "ramesh");
		
		for(Map.Entry<Integer, String>  e : 	mapObj.entrySet()) 
		{
			System.out.println(e.getKey() +"----" +e.getValue()  );
		}
	}
}
