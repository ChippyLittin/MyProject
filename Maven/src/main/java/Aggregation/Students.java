


package Aggregation;

public class Students {
	
	String name;
	int rollno;
	int age;
	ClgAdrs clg;
	
	Students(String name,int rollno,int age,ClgAdrs clg){
		
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.clg=clg;
	}
	void show()
	{
		System.out.println("name  :" +name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Age    :"+age);
		System.out.println("Clg adr :"  +clg.city+","+clg.clgname+","+clg.pin+","+clg.place);
	}
	

	public static void main(String[] args) {
		ClgAdrs ca=new ClgAdrs("CEP","PERUMON","KOLLAM",23233);
		ClgAdrs ca1=new ClgAdrs("UKF","paripally","KOLLAM",23234);
		Students s1=new Students("manu",1265,23,ca);
		Students s2=new Students("vinu",1266,23,ca1);
		s1.show();
		s2.show();
		
		

	}

}
