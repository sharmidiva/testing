package ExceptionHandling;

//public final class examp{
	//if the class is declared as final we can't inherit 
//same thing for method, variable 
//}

public class Finalex {
	public final static int add(int a,int b) {
		return(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final int x =10;//once the variable is declared as final , we can't able to change it
		 
		 //x=200;//error will come
		 
		 System.out.println("x="+x);
		 System.out.println("sum="+add(4,5));
		 
		

	}

}
