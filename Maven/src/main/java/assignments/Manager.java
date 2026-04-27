

package assignments;

public class Manager extends Developer  {
	int bonus=3870;
	
	
	Manager(String name,int id,int salary)
	{
		super(name,id,salary);
		//System.out.println(name+" "+id+" "+salary);
	}
	void Totalsalary() {
		total=bonus+basicpay;
		System.out.println("Total salary  :"+total);
	}
	
	

}
