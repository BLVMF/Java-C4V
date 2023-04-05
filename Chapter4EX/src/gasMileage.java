import java.util.Scanner;
import java.util.ArrayList;

public class gasMileage {
  public static void main(String[] args) {

    /* Create Scanner object to take integers in */
    Scanner input = new Scanner(System.in);

    System.out.println("How many trips would you like to input?");

    //initializing loop iterator
    int i = 0;

    // Allow the user to enter as much trip data as desired
    int h = input.nextInt();

    // Creat a list for mpg values to be stored
    ArrayList<Integer> mpgVal = new ArrayList<Integer>();

    // while loop to take information for as many trips as specified by the user 
    while (i < h){

      // i + 1 allows you to see what trip you're working on by negating the 0 index
      System.out.println("Trip " +(i+1) + " Enter how many miles you've driven on this trip: ");

      // stores miles driven so it can be used later on 
      int milesDriven = input.nextInt();

      System.out.println("Enter how many gallons of gas you've used on this trip: ");

      // Stores gallons used to use in calculations later on 
      int gallonsUsed = input.nextInt();

    /* Calculates MPG */
      int mPG = milesDriven / gallonsUsed;

      //Displays current trip mpg
      System.out.println("Your mpg for this trip is: " + mPG);

      // Adds mpg value to list created earlier
      mpgVal.add(mPG);

      //Increments i by 1 so that the loop eventually closes once i is equal to h 
      i++;
    }

    // Sums the value of mps in the list created
    int sum = mpgVal.stream().reduce(0,(a,b)-> a + b);

    // Calculates the avg mpg using the list and h to represent the number of values
    Float avg = (float) (sum / h);

    // displays avg mpg based on submitted trip values 
    System.out.println("Based on submitted trip data, you're averaging, " + avg + " miles/gallon");
  }
}
