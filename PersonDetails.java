/**
 * 
 */
package implement;
/******Write a Java program to create a class known as Person
with methods called getFirstName() and getLastName().
Create a subclass called Employee that adds a new method 
named getEmployeeId() and overrides the getLastName() 
method to include the employee's job title.*****/

class Person{
	void getFristName() {
		String fname="Alex ";
		System.out.println("FristName is:"+fname);
	}
	void getLastName(){
		String lname="Kumaravel ";
		System.out.println("LastName is :"+lname);
	}
}
class Employee extends Person{
	void getEmployeeId() {
		getLastName();
		int id=704;
		String Work="Formar";
		System.out.println("Employee Id :"+id);
		System.out.println("Work Name   :"+Work);
		
	}
}

public class PersonDetails {
	public static void main(String[] args) {
		Employee e =new Employee();
		e.getFristName();
		e.getEmployeeId();
		
 
	
	
	
	
	
	
	
	
 }
}
