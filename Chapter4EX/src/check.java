public class check {
  public static void main(String[] args){
    int length = 12;
    int height = 12;

    for (int i = 0; i <= height; i++) {
      if (i% 2 == 0) {
        System.out.print("* ");
      } else{
        System.out.print(" ");
      }
    for (int j = 0; j < height; j++) {
      if (j % 2 == 0) {
        System.out.print(" ");
      } else {
        System.out.print("* ");
      }
    }
    System.out.println("");
    }
  }
  
}
