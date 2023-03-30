public class Acct {
  private String name;
  private double balance;
  public Acct (String name , double balance){
      this.name = name;
      if (balance > 0)
          this.balance = balance;
  }
  public void deposit(double depositAmmount){
      if (depositAmmount > 0)
          balance = balance + depositAmmount;
  }
  public void withDrawal (double wD){
      if (wD > balance)
          System.out.println("\nInsufficient Balance");
      else 
      balance = balance - wD;
  }
  public double getBalance(){
      return balance;
  }
  public void setName(String name){
      this.name = name;
  }
  public String getName(){
      return name;
  }
  }