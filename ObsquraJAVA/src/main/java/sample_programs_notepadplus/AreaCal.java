package sample_programs_notepadplus;

public class AreaCal {
	public static void cal(double r)
	{
		double circle=(3.14*r*r);
		System.out.println("The area of the circle= "+circle);
	}
	
	public static void cal(int l, int b)
	{
		int rectangle=(l*b);
		System.out.println("The area of the rectangle= "+rectangle);
	}
	
	public static void cal(int s)
	{
		int square=(s*s);
		System.out.println("The area of the square= "+square);
	}
	
	public static void main(String args[])
	{
		AreaCal.cal(5.0);
		AreaCal.cal(5,4);
		AreaCal.cal(5);
		
	}
}
