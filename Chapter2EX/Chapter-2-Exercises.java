import java.util.Scanner;

/* Exercise 2.14 */

class A {
  public static void main(String[] args)
  {
    System.out.println("Part a: 1 2 3 4");
  }
}

class B {
  public static void main(String[] args)
  {
    System.out.print("Part b:" + " " + 1 + " ");
    System.out.print(2 + " ");
    System.out.print(3 + " ");
    System.out.print(4 + " ");
  }
}

class C{
  public static void main(String[] args)
  {
  int num1 = 1;
  int num2 = 2;
  int num3 = 3;
  int num4 = 4;
  {
    System.out.print("Part c: ");  
    System.out.printf("%d %d %d %d", num1, num2,num3,num4);
  }
}
}



/*Exercise 2.15 */

class mathismathing{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  
    System.out.println("Enter first integer: ");
    int num1 = input.nextInt();

    System.out.println("Enter second integer: ");
    int num2 = input.nextInt();

    int sum = num1 + num2;
    int mult = num1 * num2;
    int diff = num1 - num2;
    int div = num1 / num2;

    System.out.printf("Sum = %d%n", sum);
    System.out.printf("Product = %d%n", mult);
    System.out.printf("Difference = %d%n", diff);
    System.out.printf("Quotient = %d%n", div);
  
  }
}

