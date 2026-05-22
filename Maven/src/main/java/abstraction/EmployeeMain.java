



package abstraction;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee em=new ManagerEmploy();
		em.calulateBonus(23000,"Littin");
		em=new DeveloperEmploy();
		em.calulateBonus(25000,"Chippy");

	}

}
