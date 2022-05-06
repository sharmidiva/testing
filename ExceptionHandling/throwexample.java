package ExceptionHandling;

//throw is used to throw the exception explicitly in code/function/block of code
// it uses throw keyword and it always use new keyword(instance of exception)
//here it is throwing unchecked exceptipn
//unchecked excception-it throws runtime errors (Arthmetic,nullpointer,numberformat,indexoutofbound)
//used custom -userdefined exception

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
{
	super(str);
}
}


public class throwexample {
	
	public static void checkage(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("age is not valid");
		}
		else
		{
			System.out.println("valid age");
		}
	}
	
	   
	/* public static void checkage(int age) {
		 if(age<18) {
			 throw new ArithmeticException("person is not eligble for vote");//explicitly throw exception
		 }
		 // throw is used to throw exception explicitly
		 // throw is followed by new (instance of exception)
		 // throw will throw only 1 exception at a time
		 // throw is used to declare both checked and also unchecked exception
		 else
		 {
			 System.out.println("person is eligle for vote");
		 }
	 }
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkage(4);

		}
		catch(InvalidAgeException ex)
		{
		System.out.println("caught invalidage exception");

		}
	}

}
