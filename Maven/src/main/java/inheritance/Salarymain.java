




package inheritance;

public class Salarymain {

	public static void main(String[] args) 
	
	{
		Manager obj=new Manager();
		int r=obj.calc();
		System.out.println(r);
		Developer d=new Developer();
		int ob=d.calc(34567);
		System.out.println(ob);
	}

}
