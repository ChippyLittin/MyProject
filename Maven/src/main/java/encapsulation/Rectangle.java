


package encapsulation;

public class Rectangle {
	private int length;
	private int wdth;
	
	
	public void setLength(int length)
	{
		this.length = length;
	}
	public void setWdth(int wdth)
	{
		this.wdth = wdth;
	}
	public int getLength() 
	{
		return length;
	}
	
	public int getWdth() 
	{
		return wdth;
	}
	
   public  int area() 
   {
	   int area=length*wdth;
	    return area;
	}
	

	 

}
