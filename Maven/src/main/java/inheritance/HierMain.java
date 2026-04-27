

package inheritance;

public class HierMain {

	public static void main(String[] args) {
		Flower f=new Flower();
		f.smell();
		
	Rose r=new Rose();
	r.colour();
	r.smell();
	System.out.println(r.s);
	Jasmin j=new Jasmin();
	j.jas();
	j.smell();

	}

}
