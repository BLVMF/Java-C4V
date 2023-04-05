import java.util.Scanner;

public class MultiTwo {
  static boolean isMulti;
  static int num1;
  static int num2;
  static Scanner scnr = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("How many pair of integers would you like to check? ");

    

    int many = scnr.nextInt();

    for (int i = 0; i < many; i++) {
      isMultiple(num1, num2);
    }
  }

  public static boolean isMultiple(int num1, int num2){
    System.out.println("Enter first number: ");
    num1 = scnr.nextInt();

    System.out.println("Enter second number: ");
    num2 = scnr.nextInt();
    if (num1 % num2 == 0) {
      isMulti = true;
    } else {
      isMulti = false;
    }
    System.out.println(isMulti);
    return isMulti;
  }
  
}
