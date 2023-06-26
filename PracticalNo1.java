//1.Write you first java program to display “Hello World” on the screen.
package com.mycompany.prac1;
public class Prac1 {

    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
    }
}
//2.	Write a program to display your name on the first line and to display your degree program on the second line on the screen. Please use command line (cmd) to execute your code.
package com.mycompany.namedegree;
public class NameDegree {

    public static void main(String[] args) 
    {
         
        System.out.println("My name is Awanthi.");
        System.out.println(" My Degree program is Software  Engineering");
    
    }
}

/*3.	Write down a program to get the following output using a for loop. Repeat the same example by using a while loop. 

Executing Loop  0
Executing Loop  1
Executing Loop  2
Executing Loop  3
Executing Loop  4 */

//for loop
package com.mycompany.forloop;
public class ForLoop
{

    public static void main(String[] args)
    {
            int i;
            for(i=0;i<=4;i++)
            {
                System.out.println("Loope "+i);
            }
            }
}
//while loop
package com.mycompany.whileloope;
public class Whileloope
{

    public static void main(String[] args)
    {
         int i=0;
         while(i<=4);
         {
             System.out.println("Loope "+i);
             i++;
         }
    }
}
/*4.	Write a class and insert the following code block into the appropriate place. Execute the code and get the result.
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
          System.out.print(“I’m  out of the Loop now");		 “

Results: 

Repeat the same code using “continue” instead of “break”. Write down the output.

*/
package com.mycompany.mavenproject4;
public class Mavenproject4 {

    public static void main(String[] args) 
    {
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ){
         if( x == 30 ){
	    continue;
         }
         System.out.println( x );
         System.out.println("\n");
      }
          System.out.println("I’m  out of the Loop now");	

    }
}

/*5.	Write a class and insert the following code block into the appropriate place. Execute the code and get the result.
	char grade =‘A’;
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
  break;
	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
	System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);

Results: 

Repeat the same removing “break” command at line number 6. Write down the output.

Repeat the same scenario by using if-else-if statement instead of switch case. */
. package com.mycompany.passfail;
public class Passfail 
{

    public static void main(String[] args) 
    {
          char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade);
    }
}


//Repeat the same removing “break” command at line number
package com.mycompany.withoutbreak;
public class Withoutbreak 
{

    public static void main(String[] args)
    {
      
        char grade = 'A';

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " + grade);
    }
}
//This code will print the same output as the switch case code
/*6.	As of java 5 the enhanced for loop was introduced. This is mainly used for Arrays. Below code contains few mistakes. First execute the code. Then identify the errors printed on the console. Rectify all the errors and execute to get the output:
	class TestEnhanceForLoop {
   	public static void mains(String args[]){
     	 int [] numbers = {10, 20, 30, 40, 50};
      		for(int x : numbers ){
        			 System.out.print( x );
         			System.out.print(",")
      		}
	 System.out.print("\n");
      	String [] names ={“James”, "Larry", "Tom", "Lacy"}
      		for( String name : names ) {
        		 	System.out.print( name );
         			System.out.print(",");
     	   	Output: 
*/
.  package com.mycompany.lastp1;
public class Lastp1 {

    public static void main(String[] args)
     {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();

        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
    }
}
