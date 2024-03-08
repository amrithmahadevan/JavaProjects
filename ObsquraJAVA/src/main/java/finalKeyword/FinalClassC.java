package finalKeyword;

class FinalClassC extends FinalClassP {
	
	public void display1() {
		System.out.println("Final Class- child class.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClassC ob= new FinalClassC();
		ob.display1();
		ob.display();
	}

}
