package interface_Practice;

//Multiple Inheritance.

public class Sample1 implements InterMulti{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 o= new Sample1();
		o.display();
		o.print();
		
		
		//creating object
		InterMulti obj= new Sample1();
		obj.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(c);
	}

}
