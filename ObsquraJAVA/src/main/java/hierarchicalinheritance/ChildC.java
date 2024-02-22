package hierarchicalinheritance;

public class ChildC extends ParentA {
	public static void display3() {
		System.out.println("Hello from child class C");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildC obj = new ChildC();
		
		obj.display1();
		obj.display3();
	}

}
