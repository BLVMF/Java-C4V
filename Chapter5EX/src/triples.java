public class triples {
  private static final int MAX = 500;

  public static void main(String[] args){
    int a,b,c;

    for(a = 1; a < MAX; a++){
      for(b = a; b < MAX; b++){
        for(c = a; c < MAX; c++){
          if ((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2)){
            System.out.printf(" a = %d, b = %d, c = %d\n", a, b, c);
          }
        }

      }
    }

  }
  

  
}
