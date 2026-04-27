
package assignments;

public class MainEmployee {
	
   public static void main(String[] args) {
		Emp ob=new Emp();//first class
		ob.basic=15000;
	    ob.ded=1000;
	    ob.bonus=4000;
	    
	    Calc  obj=new Calc ();  //Second class
	    obj.basic=15000;
	    obj.ded=1000;
	    obj.bonus=4000;
	    obj.hra();
	   obj.pf();
	    
	    
	    TotalSlary tot= new TotalSlary(); //third class
	    tot.basic=15000;
	   tot.ded=1000;
	    tot.bonus=4000;
	    obj.hra();
	   obj.pf();
	    tot.SalarySlip();
	    //System.out.println("Total salary is: "+tot.totalsa());
	    
	    
	    
	    
		

	}

}
