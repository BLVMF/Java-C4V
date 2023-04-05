import java.util.Scanner;

public class salaryCalcTest {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);

    // setting variables
    String name;
    Double hoursBefore40;
    Double hoursAfter40;
    Double payScale = 0.0;
    boolean endLoop = false;
    

    // creating a condition for the loop to end 
    while(!endLoop){
      
      // allows to associate gross salary with a name 
      System.out.println("Enter an Employee name or enter 'exit' to quit");
      name = scnr.nextLine();

      //exits loop if keyword is entered 
      if(name.equals("exit")){
        endLoop = true;
      }else{
        // takes in hours from user 
        System.out.println("Enter hours worked, can be up to 40: ");
        hoursBefore40 = scnr.nextDouble();

        // validates that 40 hrs is the max to get paid in straight time 
        if (hoursBefore40 > 40){
          System.out.println("That's too many hours");
          
          //asks the user to re enter hours up to 40  
          System.out.println("Enter hours worked, can be up to 40: ");
          hoursBefore40 = scnr.nextDouble();
        }

        // validates that user must enter a positive number
        if(hoursBefore40 < 0){
          System.out.println("That's egregious");
          
          // Asks user to enter a legitimate number `
          System.out.println("Enter hours worked, can be up to 40: ");
          hoursBefore40 = scnr.nextDouble();
        }

        //asks user for overtime hours 
        System.out.println("Enter hours worked above 40: ");
        hoursAfter40 = scnr.nextDouble();

        // asks for pay scale 
        System.out.println("Enter employee's pay scale: ");
        payScale = scnr.nextDouble();

        // calculates gross pay 
        double payDay = (hoursBefore40 * payScale) + (hoursAfter40 * (1.5 * payScale));

        //outputs gross pay to user
        System.out.println(name + " can expect to receive " + payDay + " before taxes");
        
        //ensures employee name is not skipped next time loop is executed
        scnr.nextLine();
      }
    }
    


  }
}
