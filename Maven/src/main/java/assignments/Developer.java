


package assignments;

public class Developer extends EmployOverRiding  {
         
	int allowence=3000;
	
	Developer(String name,int id,int salary) 
	{
		super(name,id,salary);
		//System.out.println(name+" "+id+" "+salary);
	}
	
	void  Totalsalary()
	{
		total=basicpay+allowence;
		System.out.println("Total salary  :"+total);
	}
}