package atmpin;
import java.util.Scanner;
public class PinValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank o=new Bank();
		System.out.println("Enter the pin: ");
		int a=sc.nextInt();
		o.setPin(a);
		o.getPin();
	}

}
