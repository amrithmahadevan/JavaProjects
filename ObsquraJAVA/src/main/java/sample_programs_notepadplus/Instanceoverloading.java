package sample_programs_notepadplus;

public class Instanceoverloading {
	public void self()
	{
		System.out.println("Hi");
	}
	
	public void self(String s)
	{
		System.out.println("My name is "+s);
	}
	
	public void self(int a)
	{
		System.out.println(""+a);
	}
	
	public static void main(String args[])
	{
		Instanceoverloading z= new Instanceoverloading();
		z.self();
		z.self("Amrith");
		z.self(10);
	}
}
