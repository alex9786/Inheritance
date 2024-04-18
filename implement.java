/**
 * 
 */
package implement;
/******Write a Java program to create a class called Animal
with a method called makeSound(). Create a subclass
called Cat that overrides the makeSound() method to bark.****/

 class Animal{
	public void makeSound() {
	System.out.println("the animal sound is:");	
  }
}
class Cat extends Animal{
   public void bark() {
	makeSound();
	System.out.println("meo meo");
 }
} 
public class implement {
	public static void main(String[] args) {	
	Cat c = new Cat();
	c.bark();
		
 }
}
