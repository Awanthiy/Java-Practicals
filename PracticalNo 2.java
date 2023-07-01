  

/* PART 01: 
1.	Create a new class called ‘Item’ with two protected instance variables (private variables), an integer variable called ‘location’, and a String variable called ‘description’. 

2.	Add a constructor method for the Item class that takes an integer and a String as arguments (in that order). 

3.	The constructor should assign the value of these parameters to the corresponding instance variables. 

4.	Add getter and setter methods for the location and description variables. 

5.	Add another class called Monster and make the Monster class a sub-class of the Item class. 

6.	Add a constructor method to the Monster class that takes an integer and a String argument just like the Item class constructor. 

7.	Use these arguments to call the Item super class constructor from within the Monster class constructor so that the instance variables in the superclass are instantiated correctly.
*/ 
package com.mycompany.mavenproject4;
 public class item {
    private int location;
    private String description;
    
    // Constructor
    public item(int location, String description) {
        this.location = location;
        this.description = description;
    }
    
    // Getter for location
    public int getLocation() 
    {
        return location;
    }
    public void setLocation(int location) {
        this.location = location;
    }
    
    // Getter for description
    public String getDescription() {
        return description;
    }
    
    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
}
 
//Inside the class named moster
package com.mycompany.mavenproject4;
public class moster extends item
{
    public moster(int location, String description) {
    super(location, description);
  }


/*PART 02
1. Which of these keywords is used to refer to member of base class from a sub class?
 	a) upper	b) super	c) this		d) None of the mentioned


Answer: b) super
2.The modifier which specifies that the member can only be accessed in its own class is  
   a) public		b) private	c) protected		d) none 
 
 Answer: b) private	

3. Which of these is a mechanism for naming and visibility control of a class and its content?
a) Object	b) Packages
c) Interfaces	d) None of the Mentioned.

 
Answer:  b) Packages

4.Which of the following is correct way of importing an entire package ‘pkg’?
a) import pkg.				b) Import pkg.
c) import pkg.*				d) Import pkg.*
            Answer:    d) Import pkg.*


5.Which of these method of class String is used to extract a single character from a String object?
a) CHARAT()	b) charat()
c) charAt()	d) CharAt()

Answer: c) charAt()

6.Which of these method of class String is used to obtain length of String object?
a) get()	b) Sizeof()
c) lengthof()	d) length()

Answer: d) length()*/




/*PART 03: Fill in the blanks using appropriate term

1.	Real-world objects contain ___ and ___.
2.	A software object's state is stored in ___.
3.	A software object's behavior is exposed through ___.
4.	Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data ___.
5.	A blueprint for a software object is called a ___.
6.	Common behavior can be defined in a ___ and inherited into a ___ using the ___ keyword.
7.	A collection of methods with no implementation is called an ___.
8.	A namespace that organizes classes and interfaces by functionality is called a ___.
9.	The term API stands for ___?

Answers:
1.Real-world objects contain attributes and behaviors.
2.A software object's state is stored in instance variables.
3.A software object's behavior is exposed through methods.
4.Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation.
5.A blueprint for a software object is called a class.
6.Common behavior can be defined in a superclass and inherited into a subclass using the extends keyword. 
7. A collection of methods with no implementation is called an interface.
8.A namespace that organizes classes and interfaces by functionality is called a package.
The term API stands for Application Programming Interface.*/

