


package encapsulation;

public class Hospit {
	
	private int patid;
	private String medihis;
		


public void setPatid(int patid) {
	
	this.patid=patid;
	System.out.println("paient details:");
	System.out.println("patient id :"+patid);
	
}
public int getPatid() 
{
	
	return patid; 
}

/*public String getMedihis() 
{
	
	return medihis;
}*/
public void setMedihis(String medihis)
{
	
	this.medihis = medihis;
}
public void view()
{
	System.out.println("medical history :"+medihis);
}







}