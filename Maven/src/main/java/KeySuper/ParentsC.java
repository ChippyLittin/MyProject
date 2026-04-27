



package KeySuper;

public class ParentsC  extends ParentsB {
     
   String c="Its my practice program";
  
	ParentsC()
	{
		super();
		System.out.println("This is C constructor");
	}
	public void set()
	{
		int result = super.Get(2);  // calling B method
        System.out.println("Result: " + result);
		
		System.out.println("this is c method");
	}

}
