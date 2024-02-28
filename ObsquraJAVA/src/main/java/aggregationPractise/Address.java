package aggregationPractise;


public class Address {
	Student s;
	String b;
	public Address(String b, Student s) {
		this.b=b;
		this.s=s;

	}
	
	public void display() {
		System.out.println("The Student Detail \n");
		System.out.println("Student name: "+s.name);
		System.out.println("Student ROllNo: "+s.rollno);
		System.out.println("Student Address: "+b);
	}
	
	public static void main(String[] args) {
		Student o = new Student("John", 20);
		Address obj= new Address("KNRA",o);
		obj.display();
		
	}

}
