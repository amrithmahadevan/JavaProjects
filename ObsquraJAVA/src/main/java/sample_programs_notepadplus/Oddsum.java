package sample_programs_notepadplus;

public class Oddsum {
	public static void main(String args[]){
		int n=5, count=1, sum=0;
		//n=Integer.parseInt(args[0]); used in notepad++ as cmdline instead of n=5
		for(int i=1; count<=n;i+=2){
				sum=sum+i;
				count++;
			}
		System.out.println("The sum="+sum);
		}
	}
