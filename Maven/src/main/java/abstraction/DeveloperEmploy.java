



package abstraction;

public class DeveloperEmploy extends Employee {
	
            int bonus=300;

			@Override
			public void calulateBonus(int salary,String name) 
			{
				
				this.salary=salary;
				this.Name=name;
		        salary+=bonus;
		        System.out.println("Developer details  ");
		    	System.out.println("Name :"+Name+" "+"Salary :"+salary);
		    	
				
				
			}
            
            
}
