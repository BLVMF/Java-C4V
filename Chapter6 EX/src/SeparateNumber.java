import java.util.Scanner;

public class SeparateNumber {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int nr, nr1, nr2, nr3, nr4, nr5;

        System.out.print("Enter a number with 5 digits: ");
        nr = in.nextInt();

        nr1 = nr / 10000;
        nr2 = (nr % 10000) / 1000;
        nr3 = ((nr % 10000) % 1000) / 100;
        nr4 = (((nr % 10000) % 1000) % 100) / 10;
        nr5 = (((nr % 10000) % 1000) % 100) % 10;

        System.out.printf("%d%s%d%s%d%s%d%s%d%n", nr1, " ", nr2, " ", nr3, " ", nr4, " ", nr5);
    }
}
