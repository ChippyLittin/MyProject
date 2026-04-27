


package except;

public class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
	
	
	static void age(int age) throws MyException {
        if (age < 18)
        {
            throw new MyException("Age must be 18 or above");
        } 
        else 
        {
            System.out.println("You are eligible");
        }
    }
	public static void main(String[] args) {
		try {
			age(25);
			
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
