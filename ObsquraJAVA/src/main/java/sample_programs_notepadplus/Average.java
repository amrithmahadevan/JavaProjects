package sample_programs_notepadplus;

public class Average {
	public static void Avg(int a, int b, int c)
	{
		int average=(a+b+c)/3;
		System.out.println("The average of int number= "+average);
	}
	
	public static void Avg(float x, float y, float z)
	{
		double average=(x+y+z)/3.0;
		System.out.println("The average of float number= "+average);
	}
	
	public static void main(String args[])
	{
		Average.Avg(3,4,5);
		Average.Avg(3.5f,4.5f,7.0f);
	}
}
