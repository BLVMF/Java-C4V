public class square{
  // makes a square
public static void main(String[] args){
//make a square
  int n = 5;
  // outer loop is row 
  for(int i = 1; i<= n; i++){
    //inner loop prints colums
    for (int j = 1; j<= n; j++){
      System.out.print("* ");
    }
    System.out.println();
  }
}
}