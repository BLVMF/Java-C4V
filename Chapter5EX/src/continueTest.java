import java.util.*;  
import java.util.regex.Pattern;  

public class continueTest {
  public static void main(String[] args) {
    for (int count = 1; count <= 10; count++) { // loop 10 times
      if (count == 5) {
        System.out.println("five") ; // skip remaining code in loop body if count is 5 
      }
      System.out.printf("%d ", count);
    }
    System.out.printf("%nUsed continue to skip printing 5%n");
  }

  private static void skip() {
  }
}

