

package assignments;

public class TotalSlary extends Calc
{
	int total;
int totalsa() {
	
	total=basic+hra-pf-(ded+bonus);
	return(total);
		
	}
void SalarySlip() {
	
	System.out.println("CHIPPY LITTIN**");
	System.out.println("Salary Slip--");
	System.out.println("Basicpay    -  "+basic);
	System.out.println("Deduction   -   "+ded);
	System.out.println("HRA         -   "+hra());
	System.out.println("PF          -   "+pf());
	System.out.println("Bonus       -    "+bonus);
	System.out.println("Total Salary-    "+totalsa());
}

}
