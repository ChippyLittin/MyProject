



package MyInterface;

public class BankMain {

	public static void main(String[] args) {
		
		Bank b = new SBI();
        System.out.println("SBI Rate: " + b.rateOfInterest());

        Bank h = new Hdfc();
        System.out.println("HDFC Rate: " + h.rateOfInterest());

        Bank i = new Icici();
        System.out.println("ICICI Rate: " + i.rateOfInterest());
	
		
		

	}

}
