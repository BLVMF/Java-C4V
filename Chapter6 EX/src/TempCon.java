import java.util.Scanner;

public class TempCon {
  static Scanner scnr = new Scanner(System.in);
  static double fahr, cels;
  public static void main(String[] args) {    
    System.out.println("Please select a temp to convert to.\nPress 1 for Celsius or 2 for Fahrenheit: ");    
    int faranOrCel = scnr.nextInt();

    if (faranOrCel == 1) {
      celsius(fahr);
    } else if (faranOrCel == 2) {
      fahrenheit(cels);
    } else{
      System.out.println("invalid selection, good-bye.");
    }
  }
  public static double celsius(double fahr) {
    System.out.println("Enter degrees in Fahrenheit: ");
    fahr = scnr.nextDouble();

    double temp2 = 5.0 / 9.0 * (fahr - 32);

    System.out.printf("%.2f in degrees Celsius is %.2f", fahr, temp2);

    return temp2;
  }

  public static double fahrenheit( Double cels){

    System.out.println("Enter degrees in celsius: ");

    Double temp2 = 9.0 / 5.0 * cels + 32;

    System.out.printf("%.2f in degrees Fahrenheit is %.2f", cels, temp2);

    return temp2;
    }


  
}
