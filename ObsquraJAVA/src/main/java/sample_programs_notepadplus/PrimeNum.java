package sample_programs_notepadplus;

//program to check prime number

import java.util.Scanner;

public class PrimeNum {
		
		static int n;
		public static void checkPrime(){
			
			int m,flag=0;
			m=n/2;
			if(n==0 ||n==1){
				System.out.println(n+" is not a primt number.");
			}
			else{
				for(int i=2 ;i<=m; i++){
					if(n%i==0){
					System.out.println(n+" is not a prime number.");
					}
					flag=1;
					break;
				}
				
			}
			if(flag==0){
				System.out.println(n+" is a prime number.");
			}
			
			
			
		}
		
		public static void main(String args[]){
			System.out.println("Enter the number:");
			Scanner sc= new Scanner(System.in);
			n= sc.nextInt();
			PrimeNum.checkPrime();
		}
	
}
