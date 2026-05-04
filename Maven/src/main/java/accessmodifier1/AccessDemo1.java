


package accessmodifier1;


import accessmodifier.AccessDemo;

public class AccessDemo1  extends AccessDemo{
	 void show()
	 {
	   age=10;
	   System.out.println(age);
	 }
	
	

	public static void main(String[] args) {
		AccessDemo1 aa=new AccessDemo1();
		aa.show(3);
		aa.show();
	}

}
