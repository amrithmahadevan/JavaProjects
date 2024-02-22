package sample_programs_notepadplus;

//addition of two numbers using instance method, value in main method, default method

public class AddNum
{
	int n1;
	int n2;
	
	public AddNum(int a, int b)
	{
		n1=a;
		n2=b;
	}
	
	public void add()
	{
		int sum= n1+n2;
		System.out.println("The Sum="+sum);
	}
	
	public static void main(String args[])
	{
		AddNum n= new AddNum(15,5);
		n.add();
	}
}

