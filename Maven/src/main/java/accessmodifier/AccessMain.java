package accessmodifier;

public class AccessMain {

	public static void main(String[] args) {
		 Base ob=new  Base();
		 System.out.println(ob.x);
         System.out.println(ob.a);
         System.out.println(ob.b);
         //System.out.println(ob.y); //private variabile is only inside the class


       ob.protectedtest();
       ob.testdefault();
       ob.testpublic();
       //ob.testprivate();pirvate variabile


	}

}
