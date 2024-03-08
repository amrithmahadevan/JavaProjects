package exception;

import java.util.Scanner;

public class EligibilityException {
	int age;
	
	public void eligibility(int age) {
		this.age=age;
		
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new ArithmeticException("Not Eligible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EligibilityException o= new EligibilityException();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age: ");
		o.age=sc.nextInt();

		o.eligibility(o.age);

	}

}
