




package KeySuper;

public class ParentsB  extends ParentsA {
int i;
	 ParentsB ()
	 {
		 System.out.println("this is a B constructor"); 
		 System.out.println("This is parent variable: "+super.c);
	 }
	 public int Get(int b) 
	 {
		   super.display();
		return b*b;
	 }
	
}
