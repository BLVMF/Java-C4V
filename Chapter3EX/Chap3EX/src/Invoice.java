/*Invoice Class */

public class Invoice {
  private String partNumber;
  private String description;
  private int quantity;
  private double pricePerItem;
/* Constructor to set default values */
  public Invoice() {
    partNumber = "None";
    description = "None";
    quantity = 0;
    pricePerItem = 0.0;
  }
  /*Accessor methods */
  /*Get partnumber */
  public String getPartNumber() {
    return partNumber;
  }

   /*Get Description */
  public String getDescription(){
    return description;
  }

   /*Get Quantity */
  public int getQuantity() {
    return quantity;
  }

   /*Get Price per Item */
  public double getPricePerItem() {
    return pricePerItem;
  }

  /* Mutation Methods */
  /*Set Part Number */
  public void setPartNumber(String partNumber){
    this.partNumber = partNumber;
  }

  /*Set Description */
  public void setDescription(String description){
    this.description = description;
  }

  /*Set Quantity */
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  /*Set Price per Item */
  public void setPricePerItem(double pricePerItem){
    this.pricePerItem = pricePerItem;
  }
  
  /*Calculate and return Invoice Amount */
  public double getInvoiceAmount(){
    return quantity * pricePerItem;
  }
}

