package ExceptionHandling;

import java.io.IOException;

class child{
	void msg() {
		System.out.println("child method");
	}
}

public class parentandchild extends child {
	// throws will not use Complietime errors-checked exceptions
	/*void msg() throws IOException{
		System.out.println("method is in parent");
	}
	*/
	void msg() throws ArithmeticException{//here it can overriden the child method 
		System.out.println("method is in parent");
	}

	public static void main(String[] args) {
		parentandchild obj=new parentandchild();
		try {
		obj.msg();
		}
		catch(Exception e) {
			System.out.println("it is in try catch (public ststic main method)");
		}
		
	}

}
