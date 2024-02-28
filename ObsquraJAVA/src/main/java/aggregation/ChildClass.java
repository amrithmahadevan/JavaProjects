package aggregation;

public class ChildClass {
	int b;
	ParentClass ref;
	public ChildClass(int b,ParentClass ref) {
		this.b=b;
		this.ref=ref;
	}
	
	public ChildClass() {
		// TODO Auto-generated constructor stub
	}

	public void display(int b) {
		System.out.println(+b);
		System.out.println(+ref.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass ob= new ParentClass(10);
		ChildClass o= new ChildClass(5,ob);
		o.display(5);
	}

}
