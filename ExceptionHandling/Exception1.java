package ExceptionHandling;

public class Exception1 {
	//multiple catch-- for single try we can use multiple catch
	// it can use with pipe for 2 or more exception under same msg(sysout"error")
	//if not we can use seperate exception like nullpointer,arrayindexoutof,arithmetic,etc
	//if try finds 1st error, then it will not execute next following conditions
	//we can use common exception for all the exception,so that it will display common message
	//as all the arithmetic,nullpointer,array,numberformat comes from exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int b[]=new int[3];
			b[2]=40;
			//String s="abs";
			//int n=Integer.parseInt(s);
			String str=null;
			System.out.println(str.length());
			int i=7;
			int j=0;
			int k=i/j;//compile time it won't show any error
			//error will show only during runtime
			//try
			System.out.println("output of k="+k);
			
		}
	/*	catch(ArithmeticException  | NullPointerException e)
		{
		
		System.out.println("error");
		}*/
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e) {//this is the commmon exception for all the errors
			System.out.println("error occured anyway");
		}
		finally {
			System.out.println("rrest of the prgm");//it will clear the memory -garbage collector

		}

	}

}
