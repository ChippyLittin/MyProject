



package KeySuper;

 public class ChildSuper extends SuperExample 
 {
	 int n=190;
	 
	 public void display()
	 
	 {
		 super.display();
		 System.out.println("This is child class method"); 
		 System.out.println("This is the child variable:"+n+"this is the parent variable:"+super.x);
	 }
	 ChildSuper()
	 {
		 super();
		 System.out.println("This is child clsaa constructor");
	 }
	 public static void main(String[] args)
	 {
		 ChildSuper ex=new ChildSuper();
		 ex.display();
		 
		 
		
	 }

}
