package assignment_RBI;

import java.util.Scanner;

public class HDFC implements RBI{
	int p,n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC ob= new HDFC();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount: Rs");
		ob.p=sc.nextInt();
		System.out.println("Enter the duration of deposit: ");
		ob.n=sc.nextInt();

		ob.recurringDeposit();
		
	}

	@Override
	public void recurringDeposit() {
		// TODO Auto-generated method stub
		int total=p+((p*n*rate)/100);
		System.out.println("The total amount : Rs."+total);
	}

}
