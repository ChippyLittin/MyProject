

package keywords;

public class Bvechile extends Svechile{
	int x=5;
	void display()
	{
		super.show();
		System.out.println("Vaiabile:"+super.x);
	}
	Bvechile()
	{
		System.out.println("Bvechile class constructor");
	}
	Bvechile( String name,int year)
	{
	System.out.println("this is a parametarized constructor in the class Bvechile "+name  +" "+year);	
	}
	
}
