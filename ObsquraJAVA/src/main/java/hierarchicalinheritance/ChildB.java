package hierarchicalinheritance;

public class ChildB extends ParentA {
	public static void display2() {
		System.out.println("Hello from child B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildB obj= new ChildB();
		
		obj.display1();
		obj.display2();

	}

}
