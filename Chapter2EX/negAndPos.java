/* Exercise 2.32 */

import java.util.*;

public class negAndPos {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);


  int totalNeg = 0;
  int totalPos = 0;
  int totalZero = 0;

  System.out.println("Enter an integer");
  int num1 = input.nextInt();

  System.out.println("Enter an integer");
  int num2 = input.nextInt();

  System.out.println("Enter an integer");
  int num3 = input.nextInt();

  System.out.println("Enter an integer");
  int num4 = input.nextInt();

  System.out.println("Enter an integer");
  int num5 = input.nextInt();

  if (num1 < 0)
			totalNeg = totalNeg + 1;	
		
		if (num2 < 0)
			totalNeg = totalNeg + 1;
		
		if (num3 < 0)
			totalNeg = totalNeg + 1;
	
		if (num4 < 0)
			totalNeg = totalNeg + 1;
		
		if (num5 < 0)
			totalNeg = totalNeg + 1;
		
		// if any integer input is a positive number, add 1
		if (num1 > 0)
			totalPos = totalPos + 1;
		
		if (num2 > 0)
			totalPos = totalPos + 1;
		
		if (num3 > 0)
			totalPos = totalPos + 1;
		
		if (num4 > 0)
			totalPos = totalPos + 1;
		
		if (num5 > 0)
			totalPos = totalPos + 1;
		
		// if any integer input is zero, add 1
		if (num1 == 0)
			totalZero = totalZero + 1;
		
		if (num2 == 0)
			totalZero = totalZero + 1;
		
		if (num3 == 0)
			totalZero = totalZero + 1;
		
		if (num4 == 0)
			totalZero = totalZero + 1;
		
		if (num5 == 0)
			totalZero = totalZero + 1;
		
		System.out.println();
		System.out.printf("Total negative numbers: %d\n", totalNeg);	

		System.out.printf("Total postive numbers: %d\n", totalPos);	

		System.out.printf("Total zero numbers: %d\n", totalZero);


  
  }
}
