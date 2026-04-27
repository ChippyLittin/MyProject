

package encapsulation;

public class BankMain {
	
	public static void main(String []args) {
		Bank b=new Bank();
		b.deposit(23456.98);
		b.withdraw(20000.00);
		System.out.println(b.getBalance());
		
	}

}
