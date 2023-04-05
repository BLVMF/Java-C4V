public class decTri {
  //decreasing triangle(left)
  public static void main(String[] args){
    int n = 5;
    // outer loop is row 
    for(int i = 1; i<= n; i++){
      //inner loop prints colums
      for (int j = i ; j<= n; j++){
        // j = i because, i denotes row number as well as how many stars are meant to be printed. 
        // using i as the start condition
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
