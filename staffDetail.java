/**
 * 
 */
package implement;
/*****Write a Java program that creates a class hierarchy for employees 
of a company.The base class should be Employee, with subclasses Manager
 Developer, and Programmer. Each subclass should have properties such 
 as name, address, salary, and job title. Implement methods for calculating
 bonuses, generating performance reports, and managing projects.****/
 class Oner1{
	void detail(String name,int sa,String add,String title) {
		System.out.println("Employee Name    :"+name);
		System.out.println(name +" his salary  :"+sa);
		System.out.println(name+" his adderss :"+add);
		System.out.println("job  Title       :"+title);
		System.out.println("bonuses  :"+sa/15);
	}
 }
class Manager extends Oner1{
	void manager() {System.out.println();
		System.out.println("******Manager Detail:******");
		detail("Ravi",50000,"163/1,Orathanadu","Managig Derector");
	}
}
class Developer extends Oner1{
	void developer() {System.out.println();
		System.out.println("******Developer Detail:******");
		detail("Kavi",35000,"13/1,Thanjavur","Managig Derector");
	}
	
}
class Progaramer extends Oner1{
	void programer() {System.out.println();
		System.out.println("******Programer Detail:******");
		detail("Ram",25000,"063/1,Mathurai","Managig Derector");
	}
	
}


public class staffDetail {
	public static void main(String[] args) {
		 Manager m = new  Manager ();
		 m.manager();
		 Developer d = new Developer();
		 d.developer();
		 Progaramer p = new Progaramer();
		 p.programer();
		 
		
		
		
	
	
	
	
	
  }
}
