import java.util.Scanner;

public class piCalc {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
        double pi,termx;

        System.out.print("Enter any key to start or E stop: ");
        String Exit = input.next();

        while (!Exit.equals("E")) {
            System.out.print("How many terms do you want : ");
            int term = input.nextInt();

            pi=0.0;
            termx=0.0;

            for (int i = 1; i <= term; i++) {
                if (i % 2 == 0) {
                    termx = (double) -4 / (2 * i - 1);
                } else {
                    termx = (double) 4 / (2 * i - 1);
                }
                pi += termx;

            }
            System.out.println("Pi number equals = " + pi);

            System.out.print("Enter any key to start or E stop: ");
            Exit = input.next();
        }
    }
  }

