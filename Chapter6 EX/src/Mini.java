
import java.util.Scanner;

public class Mini {

  public static void main(String[] args)

  {

    Scanner sc = new Scanner(System.in);

    System.out.print("Input the first number: ");

    float num1 = sc.nextFloat();

    System.out.print("Input the Second number: ");

    float num2 = sc.nextFloat();

    System.out.print("Input the third number: ");

    float num3 = sc.nextFloat();

    System.out.print("The minimum value is " + minimum3(num1, num2, num3) + "\n");

  }

  public static float minimum3(float num1, float num2, float num3)

  {

    return Math.min(Math.min(num1, num2), num3);

  }

}
