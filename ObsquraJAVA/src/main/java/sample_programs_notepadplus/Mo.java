package sample_programs_notepadplus;

public class Mo {
	static int sum;
	public static void average(int a, int b,int c)
	{
		sum=a+b+c;
	}
	
	public static void average()
	{
		float avg = sum/3;
		System.out.println("The average ="+avg);
	}
	
	public static void main(String args[])
	{
		Mo.average(10,20,30);
		Mo.average();
	}
}
