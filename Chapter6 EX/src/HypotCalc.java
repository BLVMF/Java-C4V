import java.util.Scanner;

public class HypotCalc{


public static void main(String[] args) {

  Scanner scnr = new Scanner(System.in);

  System.out.println("Enter a value for side 1 of your triangle: ");
  double side1 = scnr.nextDouble();
  System.out.println("Enter a value for side 2 of your triangle: ");
  double side2 = scnr.nextDouble();

  double side3 = (side1 * side1) + (side2 * side2);


  System.out.printf("A triangle with %.2f and %.2f will have a hypotenuese of %.3f squared or %.3f", side1, side2, side3, Math.sqrt(side3));
   

  
}

}