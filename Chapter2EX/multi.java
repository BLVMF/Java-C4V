/* Exercise 2.26 */
import java.util.*;

public class multi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int num1 = input.nextInt();

    System.out.println("Enter a second integer: ");
    int num2 = input.nextInt();

    if (num2 % num1 == 0) {
      System.out.println(num1 +" is a multiple of " +num2);
    } else {
      System.out.println(num1 +" is not a multiple of " + num2);
    }

  }
  
}
