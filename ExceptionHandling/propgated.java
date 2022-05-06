package ExceptionHandling;

import java.io.IOException;
//compile time error -checked exception - throws

public class propgated {
	void m() throws IOException { //when we throws exception it must be either caught or it should be declared
		//we declared the exception using throws keyword voidm() method declares IOException 
		//checked exceptions are propagated through throws keyword 
		
		throw new java.io.IOException("device error");
	}
	void n() throws IOException {
		m();
	}
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception andled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		propgated obj=new propgated();
		obj.p();
		System.out.println("normal flow");

	}

}
