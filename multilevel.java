

package implement;
/*******Write a Java program to create a vehicle class hierarchy.
The base class should be Vehicle, with subclasses
Truck, Car and Motorcycle. Each subclass should have 
properties such as make, model, year, and fuel type.
Implement methods for calculating fuel efficiency, 
distance traveled, and maximum speed.****/

class Vehicle{
	void  fuelEfficiency(String fe,String model,String make,int year) {
		System.out.println("fuel type :"+fe);
		System.out.println("Model     :"+model);
		System.out.println("Make      :"+make);
		System.out.println("Year      :"+year);
	}
	void distance(double dis) {
		System.out.println("per littre:"+dis);
	}
	void  maximumSpeed(int speed) {
		System.out.println("Maximum Speed"+speed);
	}
}
class Truck extends Vehicle{
	void truck() {
		System.out.println("******Truck Details:*****");
		 fuelEfficiency("decel","Nch150","Eacher",2021);
		 distance(25.5);
		 maximumSpeed(120);
	}
}
class Car extends Vehicle{
	void car() {System.out.println();
		System.out.println("*****Car Details:*****");
		 fuelEfficiency("desel or petrol","Jmc245","BMW",2019);
		 distance(45.5);
		 maximumSpeed(140);
	}
}
class Motorcycle extends Vehicle{
	void motorcycle() {System.out.println();
		System.out.println("***** Motorcycle Details:******");
		 fuelEfficiency("petrol","NS150","RX100",2024);
		 distance(110.5);
		 maximumSpeed(220);
	}
}
class truck extends Vehicle{
	
}
public class multilevel {

	public static void main(String[] args) {
		Truck t = new Truck();
		t.truck();
		Car c= new Car();
        c.car();
        Motorcycle m = new Motorcycle();
        m.motorcycle();
	
	
  }
}
