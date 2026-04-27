


package MyInterface;

public class Demo implements  Printable,Showable {

	public static void main(String[] args) {
		
	}

	@Override
	public void show() {
                   System.out.println("This is show method");		
	}

	@Override
	public void print() {
		System.out.println("This is print method");
	}

	
	

}
