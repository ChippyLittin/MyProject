


package encapsulation;

public class Employ {
	
	double salary;
	String name;
	String role;

//setter
 public void setSalary(double salary) {
	 this.salary=salary;
 }
  public void setName(String name) {
	  this.name=name;
  }
  public void setRole(String role) {
	  this.role=role;
  }
  
  //getters method
  public double getSalary() {
	  return salary;
  }
  public String getName() {
	  return name;
  }
  public String getRole() {
	  return role;
  }
}