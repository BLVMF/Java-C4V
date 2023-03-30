/* Exercise 2.16 */
import java.util.Scanner;

public class comparison{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int num1= input.nextInt();

    System.out.print("Enter second integer: ");
    int num2 = input.nextInt();
    
    if (num1 == num2) {
      System.out.printf("%d == %d%n", num1, num2);
    }

    if (num1 != num2) {
      System.out.printf("%d != %d%n", num1, num2);
    }

    if (num1 < num2) {
      System.out.printf("%d < %d%n", num1, num2);
    }

    if (num1 > num2) {
      System.out.printf("%d > %d%n", num1, num2);
    }

    if (num1 <= num2) {
      System.out.printf("%d <= %d%n", num1, num2);
    }

    if (num1 >= num2) {
      System.out.printf("%d >= %d%n", num1, num2);
    }
  }
}