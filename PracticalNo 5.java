/*Exercise 01: 
Declare an interface called “MyFirstInterface”. Decalre integer type variable called “x”.  Declare an abstract method called “display()”.
1.	Try to declare the variable with/without public static final keywords. Is there any difference between these two approaches? Why?
2.	Declare the abstract method with/without abstract keyword. Is there any difference between these two approaches? Why?
3.	Implement this into a class called “IntefaceImplemented” . Override all the abstract methods. Try to change the value of x inside this method and print the value of x. Is it possible for you to change x? why?
*/
package com.mycompany.practical5;
public class Practical5 {

    public static void main(String[] args) 
    {
         InterfaceImplemented implemented = new InterfaceImplemented();
         implemented.display();
    }
}
package com.mycompany.practical5;
public class InterfaceImplemented implements MyFirstInterface {
     
    public void display() {
        
        System.out.println("Value of x: " + x);
    }
}
package com.mycompany.practical5;
public interface MyFirstInterface 
{
  int x = 10;  
  abstract void display();
}
/*
Exercise 03:
Try following code. What is the outcome? Why?
Class 01: 	
final class Student {  	 	 
 
final int marks = 100;
final void display();
}

Class 02:
class Undergraduate extends Studen{

}
Cannot inherit from final class Student
This is because the final keyword is used to prevent a class from being subclassed.
This is done to prevent the class's structure from being modified. In the case of the Student class, 
the marks variable is a final variable, which means that its value cannot be changed.
If a subclass could be created, then the subclass could change the value of the marks variable, 
which would violate the immutability of the Student class.

To fix the code, you would need to remove the final keyword from the Student class. This would allow you to create a subclass of Student. However, it is important to note that doing so would also allow the subclass to change the value of the marks variable, which could have unintended consequences.
*/
