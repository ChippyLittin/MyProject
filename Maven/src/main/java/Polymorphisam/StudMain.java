



package Polymorphisam;

public class StudMain {

	public static void main(String[] args) {
		
		/*Student[] stu= {  new SchoolStudent(),
				           new ClgStudent(),
				           new OnlineStudent()
				        };
		for(Student s:stu) {
			s.study();
		}*/
		Student s=new SchoolStudent();
		s.study();
		 s=new ClgStudent();
		 s.study();
		 s=new OnlineStudent();
		 s.study();

	}

}
