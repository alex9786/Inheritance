/**
 * 
 */
package implement;
/********Write a Java program to create a class called
Shape with a method called getArea(). Create a 
subclass called Rectangle that overrides the getArea()
method to calculate the area of a rectangle.******/

class Shape{
	public void getArea(int l,int b )  {
		int Area=l*b;
		System.out.println(Area);
		
	}	
}
class Rectangle extends Shape{
	public void Area() {
		System.out.println("Area is:");
	}
}

public class triangleArea {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.Area();
		r.getArea(5,7);
		
		
	}

}
