package multipleinheritance;

public class C extends B{
	public void display3() {
		System.out.println("Hello from Child class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj= new C();
		obj.display3();
		obj.display2();
		obj.display1();
	}

}
