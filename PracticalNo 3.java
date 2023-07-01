 /*
1. Develop a code for the following scenario. 
“An encapsulated class contains three variables to store Name, 
   Age and Salary of the employee. Evelop getters and setters to set and get values . Develop a test class to test your code.”*/
package com.mycompany.excer31;
public class Employee 
{
    // private instance variables
  private String name;
  private int age;
  private double salary;

  // getters and setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }


}
package com.mycompany.excer31;
public class Excer31
{

    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setAge(30);
        employee.setSalary(100000);
    }
}
//Now modify the same code by  trying to replace the setters using  a constructor. 


package com.mycompany.excer31;
 class Employee {

  // private instance variables
  private String name;
  private int age;
  private double salary;

  // constructor
  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

}

package com.mycompany.excer31;
public class Excer31
{

    public static void main(String[] args)
    {
        Employee employee = new Employee("John Doe", 30, 100000);
    }
}

