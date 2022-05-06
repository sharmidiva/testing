package ExceptionHandling;

public class exceptionex {
//use of try catch and finnally
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int j=4/0;
		System.out.println(j);//once the error occurs it will move to catch
		}
		catch(ArithmeticException e) {
			System.out.println(e);//if catch is not there means also fine it will throw error
			//and runs to finally

			
		}
		finally {
			System.out.println("need to print it");//it will execute wheather the exception occurs or not

		}

	}

}
