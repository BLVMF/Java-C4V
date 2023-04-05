import java.util.Scanner;

public class EvenOrOdd {
  static boolean isEven;
  public static void main(String[] args) {
    System.out.println("Enter a number to see if it is Even or Odd: ");
    Scanner scnr = new Scanner(System.in);
    int num = scnr.nextInt();
    isEven(num);
  }

  public static boolean isEven(int num) {
    if (num % 2 == 0) {
      isEven = true;
    } else {
      isEven = false;
    }
    System.out.println(isEven);
    return isEven;
  }
}
