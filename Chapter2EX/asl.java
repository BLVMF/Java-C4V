
/* Exercise 2.18 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class asl {
  public static void main(String[] args){

  
   Scanner input = new Scanner(System.in);
   List<Integer> list = new ArrayList<Integer>();
    
   System.out.println("Enter first integer: ");
   int num1 = input.nextInt();
   list.add(num1);
  

   System.out.println("Enter second integer: ");
   int num2 = input.nextInt();
   list.add(num2);
  

   System.out.println("Enter third integer: ");
   int num3 = input.nextInt();
   list.add(num3);

   int sum = list.stream().reduce((x,y)-> x + y).get();
   
   int product = list.stream().reduce((x,y)-> x * y).get();

   int avg = sum / 3;

   System.out.println("sum = " + sum);
   System.out.println("product = " + product);
   System.out.println("average = " + avg);
   System.out.println("smallest = " + Collections.min(list));
   System.out.println("largest = " + Collections.max(list));
   
  }
}
