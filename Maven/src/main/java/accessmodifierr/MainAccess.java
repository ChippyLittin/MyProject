package accessmodifierr;

import accessmodifier.Base;

 class MainAccess {
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
	
	public static void main(String[] args) {
		//MainAcces ob=new MainAcces();
		Base ob=new  Base();
		// System.out.println(ob.x);
        System.out.println(ob.a);
        //System.out.println(ob.b);
        //System.out.println(ob.y); //private variabile is only inside the class


     // ob.protectedtest();
     // ob.testdefault();
      ob.testpublic();
      //ob.testprivate();pirvate variabile


	}

}
