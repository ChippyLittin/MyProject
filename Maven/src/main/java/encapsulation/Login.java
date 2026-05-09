

package encapsulation;

public class Login {
	
	private String usr;
	private String pas;
	
	public String getUsr() 
	{
		return usr;
	}
	public void setUsr(String usr) {
		
		this.usr = usr;
		System.out.println("Username is :" +usr);
	}
	public String getPas() {
		return pas;
	}
	public void setPas(String pas)
	{
		this.pas = pas;
		
		if(pas.length()>=8)
		{
			
			System.out.println("password is ok");
			System.out.println("password is : "+pas);
		}
	
		else {
			
			System.out.println("password is not ok");
		}
	}
	
	
	
	

}
