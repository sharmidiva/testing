package ExceptionHandling;

public class Finalizeex {
	public void finalize1()
	{
		System.out.println("finalize is called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finalize is used to perform cleanup processing just before object is called  garbage collector
		Finalizeex f1=new Finalizeex();
		Finalizeex f2=new Finalizeex();
		f1=null;
		f2=null;
		System.gc();//garbage collector

	}

}
