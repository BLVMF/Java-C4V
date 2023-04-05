import java.util.Scanner;

public class Parking { 
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    System.out.println("How many hours would you like to park for ? ");

    Double hours = scnr.nextDouble();

    System.out.printf("Please pay: %.2f%n", calculateCharges(hours));
  }
  // Calculates charge

  public static Double calculateCharges(Double hours){
    Double  charges = 2.0;
    if (hours <= 3.0){
      return charges;
    } else if (hours <= 20.00){
      hours = hours - 3 ;
      charges = (hours * 0.5) + 2;
      return charges;
    } else{
      charges = 10.00;
      return charges;
    }
    }
  }
  

