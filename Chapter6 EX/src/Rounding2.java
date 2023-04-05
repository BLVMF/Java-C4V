import java.util.Scanner;

public class Rounding2 {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    System.out.println("Enter a Number for rounding: ");

    double x = scnr.nextDouble();

    System.out.println("You have entered " + x);

    System.out.printf(x+" rounded to the nearest integer: %.0f%n ", roundToInteger(x));

    System.out.printf(x + " rounded to the nearest Tenths: %.2f%n ", roundToTenths(x));

    System.out.printf(x + " rounded to the nearest Hundredths: %.3f%n ", roundToHundredths(x));

    System.out.printf(x + " rounded to the nearest Thousandths: %.4f%n ", roundToThousandths(x));
  }

  public static Double roundToInteger(double x) {
    double y = Math.floor(x + 0.5);
    return y;
  }

  public static Double roundToTenths(double x) {
    double y = Math.floor(x * 10 + 0.5) / 10;
    return y;
  }

  public static Double roundToHundredths(double x) {
    double y = Math.floor(x * 100 + 0.5) / 100;
    return y;
  }

  public static Double roundToThousandths(double x){
    double y = Math.floor(x * 1000 + 0.5) / 1000;
    return y;
  }
  
}
