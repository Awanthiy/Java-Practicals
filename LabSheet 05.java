/*Exercise 01:
Develop the following class execute and discuss the answer: Please note that each class stored in separate files. Write down the answer.
class SuperB {
    int x;
    void setIt (int n) { x=n;}
    void increase () { x=x+1;}
    void triple () {x=x*3;};
    int returnIt () {return x;}
}
class SubC extends SuperB {
    void triple () {x=x+3;} // override existing method
    void quadruple () {x=x*4;} // new method
}
public class TestInheritance {
    public static void main(String[] args) {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); }
}
*/
package com.mycompany.testinheritence;
public class SuperB 
{
    int x;
    void setIt(int n)
    { 
        x=n;
    }
    void increase() 
    { 
        x=x+1;
    }
    void triple() 
    {
        x=x*3;
    }
    int returnIt() 
    {
        return x;
    }
}

package com.mycompany.testinheritence;
public class SubC extends SuperB
{
    // override existing method
void triple() 
    {
        x=x+3;
    } 
    // new method
    void quadruple() 
    {
        x=x*4;
    } 
}
package com.mycompany.testinheritence;
public class TestInheritence 
{
    public static void main(String[] args) 
    {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 
    }
}

/*
Exercise 03: 
Recall the following scenario discussed during the class. Develop a code base to represent the scenario. Add a test class to invoke Lecturer and Student class by creating atleast one object from each.
Note: All the common attributes and behavior stored in the super class and only the specific fields and behavior stored in subclasses. 
Student
-	name
-	id
-	course
       +     setName()/getName()
        +    setID()/getID()
      +      setCourse()/getCourse()
Lecturer
-	name
-	id
-	programme
       +     setName()/getName()
      +      setID()/getID()
      +      setProg()/getProg()
Person
Identify field and attributes to be stored in this class
*/

package com.mycompany.testscenario;
public class Person 
{
    private String Name;
    private int ID;
    //constructor
    public Person(String Name, int ID)
{
        this.Name=Name;
        this.ID=ID;
    }
    //Setter method
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setId(int ID)
    {
        this.ID=ID;
    }
    //Getter method
    public String getName()
    {
        return Name;
    }
    public int getID()
    {
        return ID;
    }
}


package com.mycompany.testscenario;
public class Student extends Person
{
    private String Course;
    //constructor
    public Student(String Name,int ID,String Course)
    {
        super(Name, ID);
        this.Course=Course;
    }
    //setter and getter method
    public void setCourse(String course)
    {
        this.Course=Course;
    }
    public String getCourse()
    {
        return Course;
    }
}

package com.mycompany.testscenario;
public class Lecturer extends Person
{
    private String Programme;
   // Constructor
    public Lecturer(String Name, int ID, String Programme) 
super(Name, ID);
        this.Programme = Programme;
    }
    // Getter and Setter for programme
    public void setProgramme(String Programme) 
    {
        this.Programme = Programme;
    }
    public String getProgramme() 
    {
        return Programme;
    }
}


package com.mycompany.testscenario;
public class TestScenario 
{
    public static void main(String[] args) 
    {
        // Create a Student object
        Student st = new Student("Saman Perera", 28748, "Computer Science");
        System.out.println("Student Name: " + st.getName());
        System.out.println("Student ID: " + st.getID());
        System.out.println("Student Course: " + st.getCourse());
      // Create a Lecturer object
        Lecturer lec = new Lecturer("Dr.Kamal Fernando", 1001, "Software Engineering");
        System.out.println("\nLecturer Name: " + lec.getName());
        System.out.println("Lecturer ID: " + lec.getID());
        System.out.println("Lecturer Programme: " + lec.getProgramme());
    }
}

 
/*Exercise 04
Develop the following class execute and discuss the answer: Please note
that each public class stored in separate files. Write down the answer.
public class Animal{}
public class Mammal extends Animal{}
public class Reptile extends Animal{}
public class Dog extends Mammal{
   public static void main(String args[]){
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();
      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
}*/
  Output
    /*
true
true
true

The Mammal class is a subclass of Animal,
  The Reptile class is another subclass of Animal, 
  The Dog class is a subclass of Mammal, In the main method of the Dog class, three objects are created: a, m, and d.*/
