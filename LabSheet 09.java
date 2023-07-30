/*Question 01

  The Volume of a Cylinder can be found with the following formula: 
                
Volume = PI * Radius*Radius*Height    where PI=3.14159 
 
It is required to map the above class diagram to Java code. 

Note: Container is an abstract class.
           Height & Radius are private variables 
          All the methods are public
  
(i)	Write down the Java definition of class container  
(ii)	Write the Java Definition of class CylindricalContainer. (Implement the Methods)
(iii)	Create an object from CylindricalContainer and display the volume.

*/




package com.mycompany.activity1;
public abstract class Container
{
    public abstract double volume();
}




package com.mycompany.activity1;
public  class CylindricalContainer extends Container
{
    private double height,radius;
    public CylindricalContainer(double h,double r)
    {
        height = h;
        radius = r;
    }
    
    public double volume()
    {
        return 3.14594*radius*radius*height;
    }
}






package com.mycompany.activity1;
public class Activity1
{

    public static void main(String[] args)
    {
       CylindricalContainer  c1= new CylindricalContainer(12.5,6.3);
       System.out.println("Volume of the cylinder is "+c1.volume());
    }
}





/* Question 02

A Student wants to create a game called “Life”, ‘life’ is a RPG game in which a player can move up, down, left & Right. In order to implement this game assume that you need to create an abstraction of the player controllers. Make sure to print the directions of the player when keys are pressed.

*/





abstract class PlayerController {
  protected boolean isUpPressed;
  protected boolean isDownPressed;
  protected boolean isLeftPressed;
  protected boolean isRightPressed;

  public PlayerController() {
    isUpPressed = false;
    isDownPressed = false;
    isLeftPressed = false;
    isRightPressed = false;
  }

  public abstract void update();

  public boolean isUpPressed() {
    return isUpPressed;
  }

  public void setUpPressed(boolean isUpPressed) {
    this.isUpPressed = isUpPressed;
  }

  public boolean isDownPressed() {
    return isDownPressed;
  }

  public void setDownPressed(boolean isDownPressed) {
    this.isDownPressed = isDownPressed;
  }

  public boolean isLeftPressed() {
    return isLeftPressed;
  }

  public void setLeftPressed(boolean isLeftPressed) {
    this.isLeftPressed = isLeftPressed;
  }

  public boolean isRightPressed() {
    return isRightPressed;
  }

  public void setRightPressed(boolean isRightPressed) {
    this.isRightPressed = isRightPressed;
  }
}

class KeyboardPlayerController extends PlayerController 
{ public void update() {
    // Check if the up key is pressed.
    if (Keyboard.isKeyPressed(Keyboard.UP)) {
      setUpPressed(true);
    } else {
      setUpPressed(false);
    }

    // Check if the down key is pressed.
    if (Keyboard.isKeyPressed(Keyboard.DOWN)) {
      setDownPressed(true);
    } else {
      setDownPressed(false);
    }

    // Check if the left key is pressed.
    if (Keyboard.isKeyPressed(Keyboard.LEFT)) {
      setLeftPressed(true);
    } else {
      setLeftPressed(false);
    }

    // Check if the right key is pressed.
    if (Keyboard.isKeyPressed(Keyboard.RIGHT)) {
      setRightPressed(true);
    } else {
      setRightPressed(false);
    }
  }
}



public class Main {
  public static void main(String[] args) {
    KeyboardPlayerController controller = new KeyboardPlayerController();

    while (true) {
      controller.update();

      // Print the directions of the player.
      if (controller.isUpPressed()) {
        System.out.println("The player is moving up.");
      } else if (controller.isDownPressed()) {
        System.out.println("The player is moving down.");
      } else if (controller.isLeftPressed()) {
        System.out.println("The player is moving left.");
      } else if (controller.isRightPressed()) {
        System.out.println("The player is moving right.");
      }

      // Sleep for 100 milliseconds.
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

 
