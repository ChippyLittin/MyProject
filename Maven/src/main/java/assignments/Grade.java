package assignments;

public class Grade extends Average{
	 public String grade;  //first student
	 public String gradee;  //second student
	public void calgrade()
	{
	if(tot>=80)
	{
		grade="A";
	}
	
	else if(tot>60) {
	
		grade="B";}
	
	else if(tot>40) {
	
	grade="c";
	}
	
	else {
      System.out.println("Fail");
	
}
	}
	public void gradecal()
	{
		if(t>=80)
		{
			gradee="A";
		}
		
		else if(t>60) {
		
			gradee="B";}
		
		else if(t>40) {
		
		gradee="c";
		}
		
		else {
	      System.out.println("Fail");
		
	}
		}
	

public void show() {
	System.out.println("  mark sheet   ");
	System.out.println("name           : "+name);
	System.out.println("Roll no        :  "+roll);
	System.out.println("   SubjectMarks      ");
	System.out.println("Science        : "+m1);
	System.out.println("Maths          : "+m2);
	System.out.println("English        : "+m3);
    System.out.println("Total mark     :"+tot);
	System.out.println("Average        :"+a);
	System.out.println("Grade is       :"+grade);
		
}
public void shows() {
	System.out.println("  student2 ");
	System.out.println("name           : "+name1);
	System.out.println("Roll no        :  "+rollno);
	System.out.println("   SubjectMarks      ");
	System.out.println("Science        : "+ma1);
	System.out.println("Maths          : "+ma2);
	System.out.println("English        : "+ma3);
    System.out.println("Total mark     :"+t);
	System.out.println("Average        :"+av);
	System.out.println("Grade is       :"+gradee);
		
}

}
	




		

	
		
		
