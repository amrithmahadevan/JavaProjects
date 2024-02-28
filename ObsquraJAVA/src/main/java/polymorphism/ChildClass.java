package polymorphism;

public class ChildClass extends ParentClass {
	
	public void display() {
		super.display();
		System.out.println("Hello from child class.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj =new ChildClass();
		obj.display();
		
		//Another method.
		ParentClass obj1= new ChildClass();
		obj1.display();
	}

}
