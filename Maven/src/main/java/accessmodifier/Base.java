package accessmodifier;

public class Base {
	int x=10;
	private int y=19;
	protected int b=30;
	public int a=2;
	
	public void testpublic()
	{
		System.out.println("public method");
	}
	private void testprivate()
	{
		System.out.println("private method");
	}
	void testdefault()
	{
		System.out.println("default method");
	}
	protected void protectedtest()
	{
		System.out.println("protected method");
	}
	
	}
