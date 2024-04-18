/**
 * 
 */
package implement;
/******Write a Java program to create a class called Employee with methods 
called work() and getSalary(). Create a subclass called HRManager
that overrides the work()method and adds a new method called addEmployee().*****/

class Employee{
	public void work() {
	System.out.println("employee name");	
	}
}
class HRManager extends Employee{
	public void addEmployee() {
	
	System.out.println("work is");
	}
}
public class hierachical {
  public static void main(String[] args) {
	
	HRManager hm = new HRManager();	
	hm.addEmployee();	
	hm.work();	
		
		
		
 }

}

