




package Polymorphisam;

public class Costrupoly1 extends CostruPoly {
	
	Costrupoly1(String b)
	{
		super("hello");
		System.out.println("hai java: "+b);
	}
	int display(int a,int b)
	
	{    
		int parentResult = super.display(3, 4); // a*b
	    int childResult = a + b;

	    System.out.println("Parent result: " + parentResult);
	    System.out.println("Child result: " + childResult);

	    return childResult;
	}

}
