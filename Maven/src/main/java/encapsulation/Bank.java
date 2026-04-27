



package encapsulation;

public class Bank {
	
	private double balance;



public void  deposit(double amount)
{
	
	if(amount>0)
	{
		balance+=amount;
	}
	else {
		System.out.println("invalid amount");
	}
	
}
public void withdraw(double amount)
{
	if(amount>0 && amount<=balance) {
	 balance -= amount;
		
	}
	else {
		System.out.println("insufficient balance");
	}
}

public double getBalance() 
{
	
	return balance;
	
	
	
}



}

