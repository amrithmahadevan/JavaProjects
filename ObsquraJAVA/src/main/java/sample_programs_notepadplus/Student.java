package sample_programs_notepadplus;

public class Student {
	String name;
	int marks1,marks2,marks3;
	
	public Student(String name,int marks1,int marks2, int marks3)
	{
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	public int Total()
	{
		return ((marks1+marks2+marks3)/3);
	}
	
	public String Grade()
	{
		int totalmarks=Total();
		
		if(totalmarks>=90)
		{ return "A";}
		
		else if(totalmarks>=80)
		{ return "B";}
		
		else if(totalmarks>=70)
		{ return "C";}
	
		else if(totalmarks>=60)
		{ return "D";}
		
		else if(totalmarks>=40)
		{ return "E";}
		
		else if(totalmarks<40 && totalmarks>=0)
		{ return "F";}
		
		else
		{ return "Invalid";}	
	}
	
	public static void main(String args[])
	{
		Student student1= new Student("Rahul",72,85,90);
		int totalmarks1= student1.Total();
		String grade1= student1.Grade();
		System.out.println("Total marks for "+student1.name+": "+totalmarks1);
		System.out.println("Grade: "+grade1);
		
		System.out.println(" ");
		
		Student student2= new Student("Kishore",88,95,98);
		int totalmarks2= student2.Total();
		String grade2= student2.Grade();
		System.out.println("Total marks for "+student2.name+": "+totalmarks2);
		System.out.println("Grade: "+grade2);
	}
}

