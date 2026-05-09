


package encapsulation;

public class Car {
	
	private int speed;
	
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int  getSpeed()
	{
		return speed;
	}
	public void accelerate()
	{
		if(speed<200) {
			
			System.out.println("your" +" "+speed+"low accelarete and increes the speed");
		}
		else {
			System.out.println("Speed is ok");
		}
	}
		public void brake()
		{
		if(speed>=200)
		{
			System.out.println("you just keep brake otherwise accident will occur: "+ speed);
		}
		else {
			System.out.println("spEed ok..safe journey");
		}
		}
		
			
		
	
	
	

}
