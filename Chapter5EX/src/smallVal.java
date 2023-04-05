import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class smallVal {
  public static void main(String[] args){
    // Create Scanner object
    Scanner input = new Scanner(System.in);
    boolean endLoop = false;

    System.out.println("Welcome to the find the smallest integer! \nPress any key to continue or enter 'exit' to quit.");

    String goOn = input.nextLine();

    if(goOn.equals("exit")){
      System.out.println("Thanks for playing!");
      endLoop = true;
    } else {
        System.out.println("How many integers would you like to enter?");

        //sets loop iterator
        int i = 0; 
        // set the number of times the loop will run 
        int h = input.nextInt();

        //create a list to store integers 
        ArrayList<Integer>smInt = new ArrayList<Integer>();
    
        //while loop 
        while (i < h) {
        
          System.out.println("Enter your "+(i+1) +" integer: ");

          int val = input.nextInt();

          //add integer to the list 
          smInt.add(val);
          i++;
          }
        int min = Collections.min(smInt);

        System.out.println("The Minimum Value is: " + min);
      }
  }
}
