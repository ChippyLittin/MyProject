



package abstraction;

public class ManagerEmploy extends Employee {
	
	int bonus=450;
	

	@Override
	public void calulateBonus(int salary,String name) {
	
	this.salary=salary;
	this.Name=name;
	salary+=bonus;
	System.out.println("Manager details  ");
	System.out.println("Name :"+Name+" "+"Salary :"+salary);
	System.out.println();
	
		
	}
	
	

}
