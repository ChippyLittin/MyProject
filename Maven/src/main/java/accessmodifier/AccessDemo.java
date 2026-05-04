


package accessmodifier;

public class AccessDemo {

	private String name;  //private variable access
     protected int age;  //protected variable
     
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	void display()  //default access modifier
	{
		System.out.println("hello world...");
	}
	  protected int show(int age)
	  {
		  this.age=age;
		 return age;
	  }
	  
	 public static void main(String[] args) {
		
		AccessDemo ac=new AccessDemo();
		String s="CHIPPY";
		System.out.println(s);
		ac.display();
		int a=ac.show(24);
	    System.out.println(a);

		
				
	
	}

}
