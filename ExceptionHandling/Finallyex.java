package ExceptionHandling;

public class Finallyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally will execute wheather exception occurs or not
		//important code which we needs to perform can use here
		try
		{
			
			int a[]=new int [5];
			a[8]=10;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("finally block will execute whethere the exception occurs or not");
		}

	}

}
