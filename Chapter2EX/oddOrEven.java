/* exercise 2.25 */

import java.util.*;

public class oddOrEven {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int num = input.nextInt();

    if (num % 2 == 0){
      System.out.println(num + " is even");
    } else {
      System.out.println(num + " is odd");
    }

    
  }
}
