package interface_Practice;

public class Main implements InterClass,InterMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Main obj= new Main();
		obj.display();
		obj.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int sum= a+b;
		System.out.println(+sum);
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(+c);
	}

}
