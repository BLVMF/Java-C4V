import java.util.Scanner;


public class Rounding1 {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("Input a number: ");
    double x = scnr.nextDouble();
    double y = Math.floor(x + 0.5);
    
    System.out.println("The orginal number is: " + x + " after adding 0.5 the new number has been floored to: " + y);
  }
}
