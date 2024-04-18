/**
 * 
 */
package implement;
/****Write a Java program to create a class called Shape with methods
called getPerimeter() and getArea(). Create a subclass called
Circle that overrides the getPerimeter() and getArea() methods 
to calculate the area and perimeter of a circle.********/

 class Shapes{
	 
	public double getPerimeter() {
		return 0.0;
	}
	public double getArea() {
		return 0.0;	
	}
}
class circle extends Shapes{
	  private double radius;
	 public circle(double radius) {
	     this.radius = radius;
	    }
	  public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;		
	}
}
public class CircleArae {
	public static void main(String[] args) {
		double r=3.4;
	circle c = new circle(r);
	System.out.println(c.getArea());
	System.out.println(c.getPerimeter());
	
	
	
	
	
	
	
	
}
}
