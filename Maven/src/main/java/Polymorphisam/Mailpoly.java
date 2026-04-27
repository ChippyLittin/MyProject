


package Polymorphisam;

public class Mailpoly {

	public static void main(String[] args) {
	Payment p=new Payment();
	p.pay();
	
	Debit d=new Debit();
	d.pay();
	
	Upi u =new Upi();
			u.pay();

	}

}
