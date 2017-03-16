package tutorial.core.services.exceptions;

public class AccountExistsException extends RuntimeException
{
	
	public AccountExistsException()
	{
		super();
	}
	
	public AccountExistsException(String message)
	{
		super(message);
	}
	
	public AccountExistsException(Throwable cusae)
	{
		super(cusae);
	}
	
	public AccountExistsException(String message,Throwable cuase)
	{
		super(message,cuase);
	}
	
}
