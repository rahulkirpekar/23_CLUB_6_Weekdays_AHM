package oops.abstopic.interfacetopic.task1;


public class TestApp2 
{
	public static void getInstance(Person p) 
	{
		if (p instanceof School) 
		{
			School s = (School)p;
			s.getResult();
			s.getBehave();
			
		} else if(p instanceof Org) 
		{
			Org o = (Org)p;
			o.getBehave();
			o.getTask();
			
		}else if(p instanceof PublicPlace) 
		{
			PublicPlace pobj = (PublicPlace)p;
			pobj.getBehave();
			pobj.getEvent();
		}
	}
	public static void main(String[] args) 
	{
		Person p = new Org();
		
		TestApp2.getInstance(p);
		
		p = new School();
		TestApp2.getInstance(p);
	}
}
