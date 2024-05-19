package oops.polymorphism.runtime.task1;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace--Citizen--getBehave()");
	}
	public void getEvent() 
	{
		System.out.println("PublicPlace--Citizen--getEvent()");
	}
}
