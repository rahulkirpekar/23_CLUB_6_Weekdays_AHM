package exceptiontopic.task1;

public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}