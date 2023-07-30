class Employee {
    private String name;
    private int basicSalary;
    private int bonus;

    public Employee(String name, int basicSalary, int bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int calculateBonusAmount() {
        return this.basicSalary + this.bonus;
    }

    public void printDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Bonus Amount: " + this.calculateBonusAmount());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bogdan", 50000, 10000);

        employee.printDetails();
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
//part 2
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
