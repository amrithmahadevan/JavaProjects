package simpleInheritance;

public class ChildA extends ParentA {
	public void get() {
		System.out.println("Hello from child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildA ob= new ChildA() ;
		
	ob.get();
	ob.display();

	}

}
