


package keywords;

public class StaicFnal {
	int id ;
	static String clg="xyz";
	StaicFnal(int id)
	{
		this.id=id;
		
	}
	void display()
	{
		System.out.println(id+" "+clg);
	}
	public static void main(String[] args) {
		StaicFnal ob=new StaicFnal(103);
		StaicFnal ob1=new StaicFnal(108);
	ob.display();
	ob1.display();
 
	}

}
