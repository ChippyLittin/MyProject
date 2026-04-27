

package encapsulation;

public class Student {
	private String name;
	private  int marks;
	
	public Student(String name,int marks) 
	{
		this.name=name;
		
    }

	public String getName()
	{
		return name;
	}

	
	
public void setMark(int marks)
{
   if(marks>0&&marks<=100)
	{
		this.marks=marks;	
	
	}
	else
	{
		System.out.println("Marks must be between 0 and 100");
	}	
}
	public int getMark()
	{
		return marks;
	}

	
}
