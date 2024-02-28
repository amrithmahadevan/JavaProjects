package abstraction;

public class AbstractionClass2 extends AbstractionClass1 {

	public static void main(String[] args) {
		AbstractionClass2 ob= new AbstractionClass2();
		ob.method1();
		ob.display();
		AbstractionClass1.dis();			//invoking static method
		
		//AbstractionClass1 con= new AbstractionClass2();    //invoking constructor(Not required as child class object can also ivoke it as it is extended.)
		
	}

	@Override
	public void method1() {										//instantation of abstract method
		System.out.println("This a secret message.");
		
	}

}
