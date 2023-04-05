import java.util.Scanner;
import java.util.*;


public class sales {
    public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    // initialise variables
    double price = 0.00;
    int quantity = 0;
    double salez;
    
    //initialise array to hold sales of each item
    ArrayList<Double> sales = new ArrayList<Double>();

    System.out.println("How many sales would you like to input? ");
    int salesCount = scnr.nextInt();
    int i = 0;
    while (i < salesCount) {
      System.out.println("Which product number did you sell? ");
      int prodNum = scnr.nextInt();
        switch(prodNum){
          case 1:
            price = 2.98;
            break;
          case 2:
            price = 4.50;
            break;
          case 3:
            price = 9.98;
            break;
          case 4:
            price = 4.49;
            break;
          case 5:
            price = 6.87;
            break;
        }
        scnr.nextLine();
        System.out.println("Enter quantity sold: ");
         quantity = scnr.nextInt();
         salez = quantity * price;
         sales.add(salez);
         i++;
    }
   Double total = sales.stream().reduce(Double::sum).get();
   System.out.printf("Total sales are: %.2f ",total);
  }
  
}
