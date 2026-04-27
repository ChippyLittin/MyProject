

//Write a program where constructors and overridden methods are used together.


package Polymorphisam;

public class CostruPoly {
	
	int display(int a,int b)
	{
		System.out.println("constructors and overridden methods");
		return a*b;
	}
	
	CostruPoly (String a)
	{
	System.out.println(a);	
	}
}
