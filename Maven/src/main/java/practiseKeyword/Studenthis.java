



package practiseKeyword;

public class Studenthis {
	
	Studenthis()
	{
		this(101,"Littin");
		System.out.println("DefaultConstructor");
		
	}
	Studenthis(int id,String name)
	{
		
		System.out.println(id+" "+name);
	}

	
	public static void main(String[] args) 
	{
		Studenthis st = new Studenthis();
		
		

		
	}

}
