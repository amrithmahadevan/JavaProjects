package assignment_bank;

import java.util.Scanner;

public class Contractor extends Employee {
	int salary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor ob= new Contractor();
		ob.calculateSalary();
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount per hour: ");
		Scanner sc=new Scanner(System.in);
		int pay = sc.nextInt();
		
		salary=pay*8;
		
		System.out.println("The Employee Salary is Rs."+salary);
		
	}

}
