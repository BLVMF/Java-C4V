import java.util.Scanner;

public class salesComission {
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
   
    // Lay out variables to be used 
    int sold1, sold2, sold3,sold4;

    double sold1Val, sold2Val, sold3Val, sold4Val, weeklysalary;
    
    // Allow the loop to keep running as long as a name is entered 
    boolean endLoop = false;

    //initialise while loop
    while (!endLoop) {

      System.out.println("Enter a Sales Associate name or enter 'exit' to quit");
      String salesAss = input.nextLine();
      //Allows user to exit loop 
      if(salesAss.equals("exit")){
        endLoop = true;
      }else{
        // Takes in quatities of units sold and calculates their gross values 
        System.out.println("How much of item 1 did they sell? ");
        //User inputs how many of the item are sold 
        sold1 = input.nextInt();
        //Takes user quantity and multiples it by the value of the item
        sold1Val = sold1 * 239.99;

        System.out.println("How much of item 2 did they sell? ");
        sold2 = input.nextInt();
        sold2Val = sold2 * 129.75;

        System.out.println("How much of item 3 did they sell? ");
        sold3 = input.nextInt();
        sold3Val = sold3 * 99.95;

        System.out.println("How much of item 4 did they sell? ");
        sold4 = input.nextInt();
        sold4Val = sold4 * 350.89;

        // Calculates the employees weekly salary usiong gross sales and set salary 
        weeklysalary = ((sold4Val + sold3Val + sold2Val + sold1Val) * 0.09) + 200;

        // Prints out a summary of all values w]entered 
        System.out.println("Weekly Summary for " + salesAss);
        System.out.println("Quantity of Item " + sold1 + " Value: " + sold1Val);
        System.out.println("Quantity of Item " + sold2 + " Value: " + sold2Val);
        System.out.println("Quantity of Item " + sold3 + " Value: " + sold3Val);
        System.out.println("Quantity of Item " + sold4 + " Value: " + sold4Val);

        System.out.println(salesAss + " earnings for the week are: " + weeklysalary);

        // ensures that the name field is not skipped when the loop starts again 
        input.nextLine();

      }
    }
  }
}
