package finalKeyword;

public class FinalKeyword {
	final int i=100;

	public void display() {
		i=25;
		System.out.println(+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword obj= new FinalKeyword();
		obj.display();
	}

}
