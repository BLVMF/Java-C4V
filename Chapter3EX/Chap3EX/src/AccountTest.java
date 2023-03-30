import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Acct account1 = new Acct ("June" , 69000);
        Acct account2 = new Acct ("Goliath" , 5000);
        System.out.printf("%s Balance: %.2f" , account1.getName(),account1.getBalance());
        System.out.printf("%n%s Balance: %.2f" , account2.getName(), account2.getBalance());
       
        System.out.println("\nEnter an amount to deposit into June's account: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);
        System.out.printf("%n%s Balance: %.2f" , account1.getName(),account1.getBalance());
        
        System.out.println("\nEnter an amount to deposit into Goliath's account: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);
        System.out.printf("%n%s Balance: %.2f" , account2.getName(),account2.getBalance());

        System.out.println("\nEnter the Amount that will withdraw from June's Account: ");
        double wD = input.nextDouble();
        System.out.printf("Withdrawing %.2f from June's Account",wD);
        account1.withDrawal(wD);
        System.out.printf("%n%s's Balance: %.2f" , account1.getName(),account1.getBalance());

        System.out.println("\nEnter the Amount that will withdraw from Goliath's Account: ");
        double wD2 = input.nextDouble();
        System.out.printf("Withdrawing %.2f from Goliath's Account",wD);
        account2.withDrawal(wD2);
        System.out.printf("%n%s's Balance: %.2f" , account2.getName(),account2.getBalance());
    }
        }