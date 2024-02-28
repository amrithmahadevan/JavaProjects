package abstraction;

public abstract class AbstractionClass1 {
	public AbstractionClass1() {
		System.out.println("This is a constructor.");
	}
	public abstract void method1();			//abstract method 
	
	public void display() {
		System.out.println("Hello java.");
	}
	
	public static void dis() {				//Static method
		System.out.println("Static method printing.");
	}
}
