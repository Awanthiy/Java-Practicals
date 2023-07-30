/* Practical 07: Inheritance & Abstract Classes
 Exercise 01:
  Try following code. What is the outcome? Why?

  Class 01: 	
  final class Student 
	final int marks = 100;
	final void display();
}

class 02: 
   class Undergraduate extends Student{} */

 displayed:  Cannot override final method display() in class Student

  * The code will not compile because the display() method is declared as final. A final method cannot be overridden by a subclass, and since the Student class is final, it cannot be subclassed. Therefore, the display() method cannot be overridden.



 /*Exercise 02:
Develop a code base for the following scenario. Shape class contains an abstract method called “calculateArea” and non-abstract method called “display”. Try to pass required values at the instantiation. Recall what we have done at the lecture…*/




abstract class Shape {
  private String name;
  private double length;
  private double breadth;

  public Shape(String name, double length, double breadth) {
    this.name = name;
    this.length = length;
    this.breadth = breadth;
  }

  public abstract double calculateArea();

  public void display() {
    System.out.println("The name of the shape is: " + name);
    System.out.println("The length of the shape is: " + length);
    System.out.println("The breadth of the shape is: " + breadth);
  }
}



class Circle extends Shape {
  private double radius;

  public Circle(String name, double radius)
  {
    super(name, 2 * radius, 2 * radius);
    this.radius = radius;
  }


  
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}






class Rectangle extends Shape {

  public Rectangle(String name, double length, double breadth) {
    super(name, length, breadth);
  }

  @Override
  public double calculateArea() {
    return length * breadth;
  }
}



public class Main {
  public static void main(String[] args) {
    Shape circle = new Circle("Circle", 5);
    System.out.println("The area of the circle is: " + circle.calculateArea());
    circle.display();

    Shape rectangle = new Rectangle("Rectangle", 10, 20);
    System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
    rectangle.display();
  }
}

  
