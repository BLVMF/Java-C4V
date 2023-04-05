public class starprint {
  public static void main(String[] args){
    int n = 5; 
    for (int i = 1; i<= n; i ++){
      // broke it up into boxes
      //box 1 
      for (int j = 1; j<= i; j ++){
        System.out.print("* ");
      }
      for (int j = i; j <=n; j++){
        System.out.print("  ");
      }

      //box 2 
      for(int j = i; j<=n; j++) {
        System.out.print("* ");
      }
      for (int j = 1; j<= i; j++){
        System.out.print("  ");
      }
      
      //box 3 
      for (int j = 1; j<i; j ++){
        System.out.print("  ");
      }
      for (int j = i; j <=n; j++){
        System.out.print("* ");
      }

      //box 4
      for(int j = i; j<=n; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j<= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
