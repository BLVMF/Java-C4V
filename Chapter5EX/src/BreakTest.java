public class BreakTest {
  public static void main(String[] args) {
    int count; // control variable also used after loop terminates
    
    boolean endLoop = false;
    for (count = 1; count <= 10; count++) { // loop 10 times
      while (count == 5) {
        endLoop = true; // terminates loop if count is 5
        }

      System.out.printf("%d ", count);
    }

    System.out.printf("%nBroke out of loop at count = %d%n", count);
  }
}