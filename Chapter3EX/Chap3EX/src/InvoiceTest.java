import java.util.Scanner;

public class InvoiceTest {
  public static void main(String[] args){

    Scanner scnr = new Scanner(System.in);
    String partNum;
    String descr;
    int quantity;
    double price;

    /* Create 2 invoice objects */
    Invoice Invoice1 = new Invoice();
    Invoice Invoice2 = new Invoice();

    /*Get Invoice 1 details from user */
    System.out.println("Invoice 1");
    System.out.print("Enter the part number: ");
    partNum = scnr.nextLine();

    System.out.print("Enter the part description: ");
    descr = scnr.nextLine();

    System.out.print("Enter the quantity: ");
    quantity = scnr.nextInt();

    System.out.print("Enter the price: ");
    price = scnr.nextDouble();

    System.out.println("");

    /*Set Invoice 1 details */
    Invoice1.setPartNumber(partNum);
    Invoice1.setDescription(descr);
    Invoice1.setQuantity(quantity);
    Invoice1.setPricePerItem(price);

    

    /*Invoice 2 details */
    System.out.println("Invoice 2");
    System.out.println("Enter the part number: ");
    scnr.nextLine();
    partNum = scnr.nextLine();

    System.out.print("Enter the part description: ");
    descr =scnr.nextLine();

    System.out.print("Enter the quantity: ");
    quantity = scnr.nextInt();

    System.out.print("Enter the price per item: ");
    price = scnr.nextDouble();

    /* Set Invoice 2 details */

    Invoice2.setPartNumber(partNum);
    Invoice2.setDescription(descr);
    Invoice2.setQuantity(quantity);
    Invoice2.setPricePerItem(price);
    System.out.println();


    /*Display invoice 1's information */

    System.out.println("Invoice 1 Summary ");
    System.out.println("Part number " + Invoice1.getPartNumber());
    System.out.println("Description " + Invoice1.getDescription());
    System.out.println("Quantity " + Invoice1.getQuantity());
    System.out.println ("Price per Item " + Invoice1.getPricePerItem());
    System.out.println();
    System.out.println("-----------------------------------------");
    System.out.print("Your total is: $ " + Invoice1.getInvoiceAmount());

     /*Display invoice 2's information */

    System.out.println("Invoice 2 Summary");
    System.out.println("Part Number " + Invoice2.getPartNumber());
    System.out.println("Description " + Invoice2.getDescription());
    System.out.println("Quantity " + Invoice2.getQuantity());
    System.out.println("Price per Item " + Invoice2.getPricePerItem());
    System.out.println();
    System.out.println("-----------------------------------------");
    System.out.print("Your total is: $ " + Invoice2.getInvoiceAmount());
  }
}
