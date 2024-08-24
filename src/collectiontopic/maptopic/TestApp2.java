package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		LinkedHashMap<Integer,String> mapObj = new LinkedHashMap<Integer,String>();

		TreeMap<Integer,String> mapObj = new TreeMap<Integer,String>();

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
