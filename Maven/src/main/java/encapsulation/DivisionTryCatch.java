


package encapsulation;

public class DivisionTryCatch {

	public static void main(String[] args) {
		try {
			int a=1;
			int b=0;
			int res=a/b;
			System.out.println(res);
			 int i[]= {10,20,30};
			 System.out.println(i[6]); 
			 
			
		}
		catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
			//System.out.println(e);
			//System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException r) {
			 System.out.println(r);
			 System.out.println(r.getMessage());
		}
		finally {
			System.out.println("program runs");
		}

	}

}
