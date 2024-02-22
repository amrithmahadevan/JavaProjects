package sample_programs_notepadplus;

public class ThisEx1 {
	int a,b;
	public ThisEx1(int a, int b)
	{
		this();		//invoking the default constructor....Also constructor invoking should the first statement...only one constructor can be invoked in a constructor..
		this.a=a;
		this.b=b;
		
		this.get();  //method is invoked //also  ' get()'
		
	}
	
	public ThisEx1()
	{
		System.out.println("Default Constructor");
	}
	
	public void get()
	{
		System.out.println("The numbers are:"+a+" "+b);
	}
	
	public static void main(String args[])
	{
		ThisEx1 s=new ThisEx1(5,10);
		//s.get();
	}
}
