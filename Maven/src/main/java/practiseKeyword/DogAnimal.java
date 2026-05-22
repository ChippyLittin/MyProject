

// call parent class constructor
package practiseKeyword;

public class DogAnimal extends SuperAnimal {
	String name="hary";
	
	DogAnimal()
	{
		this("white");
		System.out.println("child class constructor");
	}
	DogAnimal(String colour)

	{
		super();
		System.out.println("colour of the dog is :"+colour);
	}
	void view()
	{
		System.out.println("chilad class variable :"+name);
		System.out.println("Parent class variable :"+super.name);
	}
	void sound()
	{
		
		System.out.println("Dog barks");
	}
	void show()
	{
		sound();
		super.sound();
	}
 
	public static void main(String[]args) {
       
		DogAnimal d1 = new DogAnimal();
		d1.view();
		d1.show();
 
 }
	
	
}
