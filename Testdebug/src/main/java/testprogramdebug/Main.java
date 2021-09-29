package testprogramdebug;



public class Main 
{
	public static void main(String[] args)
	{
		try
		{
			int a,b;
			b=2;
			a=5/b;
			System.out.println("A");
		}
		catch(ArithmeticException e)
		{
			System.out.println("B");
		}
		finally
		{
			System.out.println("c");
		}
	}

}
