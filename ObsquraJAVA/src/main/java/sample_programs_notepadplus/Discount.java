package sample_programs_notepadplus;

public class Discount {
	static int x,y,total;
	public static void cost(int a, int b)
	{
		x=a;
		y=b;
		total= x+y;
		System.out.println("The total cost:"+total);
	}
	
	public static void newprice()
	{
		double sp;
		if(total>5000)
		{
			sp=(total*0.80);
			System.out.println("The final price:"+sp);
		}
		else
		{
			sp=total;
			System.out.println("The final price:"+sp);
		}
	}
	
	public static void main(String args[])
	{
		Discount.cost(1500,4500);
		Discount.newprice();
	}
}
