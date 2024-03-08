package exception;

public class ExceptionPrg {
	int a=10;
	
	public void cal() {
		try { 
		int b=a/0;
		System.out.println(+b);
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception handled. " +ex);
		}
		finally {
			System.out.println("Finally used.");
		}
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPrg o= new ExceptionPrg();
		o.cal();
	}

}
