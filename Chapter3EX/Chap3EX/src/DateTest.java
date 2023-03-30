import java.util.Scanner;

public class DateTest {
  /**
   * @param args
   */
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);

    Date Date = new Date();

    System.out.println("Enter day DD: ");
    int day = scnr.nextInt();

    System.out.println("Enter month MM: ");
    int month = scnr.nextInt();

    System.out.println("Enter year, yyyy: ");
    int year = scnr.nextInt();

    Date.setDay(day);
    Date.setMonth(month);
    Date.setYear(year);

    Date.displayDate();
  }

}
