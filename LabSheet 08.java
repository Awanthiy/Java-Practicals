/*Exercise 01:
Create a class named "BankAccount" with private instance variables "accountNumber" and "balance."
Implement encapsulation by providing public getter and setter methods for both variables. Additionally,
create an abstract method called "calculateInterest" in the "BankAccount" class. Implement two
subclasses, "SavingsAccount" and "CheckingAccount," that extend the "BankAccount" class and provide
their own implementations of the "calculateInterest" method. Write the implementation code for the
getter and setter methods in the "BankAccount" class, and the "calculateInterest" method in both the
"SavingsAccount" and "CheckingAccount" classes. Assuming that the interest for saving is 12% and
checking is 2% (both private variables), find out What will be the interest for a person with 1 million in his
checking and 20 million in his saving account.*/
abstract class BankAccount {
  private String accountNumber;
  private double balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
  private double interestRate = 0.12;

  @Override
  double calculateInterest() {
    return balance * interestRate;
  }
}

class CheckingAccount extends BankAccount {
  private double interestRate = 0.02;

  @Override
  double calculateInterest() {
    return balance * interestRate;
  }
}

public class Exercise01 {
  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SavingsAccount();
    savingsAccount.setAccountNumber("123456789");
    savingsAccount.setBalance(2000000);

    CheckingAccount checkingAccount = new CheckingAccount();
    checkingAccount.setAccountNumber("987654321");
    checkingAccount.setBalance(1000000);

    double savingsInterest = savingsAccount.calculateInterest();
    double checkingInterest = checkingAccount.calculateInterest();

    System.out.println("Interest for savings account: " + savingsInterest);
    System.out.println("Interest for checking account: " + checkingInterest);
  }
}
/*Exercise 02:
Create an interface called "Shape" with two abstract methods: "double calculateArea()" and "double
calculatePerimeter()". Implement the "Shape" interface in three classes: "Circle", "Rectangle", and
"Triangle". Each class should have private instance variables relevant to its shape, and provide public
getter and setter methods for these variables. Additionally, each class should define a constructor that
initializes the instance variables. Write the implementation code for the "Shape" interface, the getter and
setter methods in each class, and the constructors in each class.*/
interface Shape {
  double calculateArea();
  double calculatePerimeter();
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * (width + height);
  }
}

class Triangle implements Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return 0.5 * base * height;
  }

  @Override
  public double calculatePerimeter() {
    return base + height + Math.sqrt(base * base + height * height);
  }
}

public class Exercise02 {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    System.out.println("Circle area: " + circle.calculateArea());
    System.out.println("Circle perimeter: " + circle.calculatePerimeter());

    Rectangle rectangle = new Rectangle(10, 20);
    System.out.println("Rectangle area: " + rectangle.calculateArea());
    System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

    Triangle triangle = new Triangle(10, 20);
    System.out.println("Triangle area: " + triangle.calculateArea());
    System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
  }
}
