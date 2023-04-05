import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class creditLimit {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // initialising account number
    int account = 1; 

    //declaring variables to be used
    int balance, charges, credits, credit_limit;

    // as long as the user enters a number that is not 0 the program will run. 
    while (account !=0 ){
      // collects requisite information from user 
      System.out.println();
      System.out.println("Enter account number: ");
      account = scan.nextInt();

      System.out.println("Enter Opening Balance: ");
      balance = scan.nextInt();

      System.out.println("Enter Total Charges: ");
      charges = scan.nextInt();

      System.out.println("Enter Total Credits: ");
      credits = scan.nextInt();

      System.out.println("Enter Credit Limit: ");
      credit_limit = scan.nextInt();
      
      // calculates new balance based on information given 
      int newbal = balance + charges - credits;

      // will alert user if credit limit is exceeded; as well as inform user how much credit is available for those who haven't hit their limit.
      if (newbal > credit_limit) {
        System.out.println("You have exceeded your credit limit");
      } else {
        System.out.println("Your new balance: " + newbal);
      }

    }
    
  }
}
