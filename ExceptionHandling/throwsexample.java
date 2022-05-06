package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//program for throws 

//throws is used in method signature to declare exception
		//throws is followed by name of exception 
// throws can use only uncheckedd exception
		//throws can declare multiple exception  that can throw by method like ArithmeticException,NullPointerException
		// example is void method()  doesn't throws IOException,FileNotFoundExCeption (checked exceptions)
public class throwsexample {
	
	
	public static void method() throws ArithmeticException { 
		// throws is used in method signature to declare exception
		//throws is followed by name of exception 
		//throws can declare multiple exception  that can throw by method
		// example is void method() throws IOException,FileNotFoundExCeption etc
		
		System.out.println("inside main method");
		throw new ArithmeticException("throwing arithmetic exception");
	
       //throw explicitly checked exception
		
	}

	public static void main(String[] args) {
		
		try {
			method();
			}
		catch (ArithmeticException e)
			{
	
			System.out.println("inside catch from public void main method");
	
			}
	}

}
