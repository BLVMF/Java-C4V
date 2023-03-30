/* Exercise 2.28 */

import java.util.*;

public class circle {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("enter the Radius of your circle: ");
    float rad = input.nextFloat();

    float pi = (float) Math.PI;
    float diam = 2 * rad;
    float circum = 2 * pi * rad;
    float area = pi * (rad * rad); 

    System.out.printf(
      "Diameter is %.0f \n", diam);
    System.out.printf(
      "Circumfrence is %f\n", circum);
      
    System.out.printf(
      "Area is %f", area);

  }
}
