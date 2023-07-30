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
