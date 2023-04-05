public class infinite {
  public static void main(String[] args){
    int i = 2;
    for (int j = 1; j > 0; j++){
      int g = i * j;
      System.out.println(g);
    }
    }
  }
  

/*The program never ends, it just runs untl it crashes or the user terminates the program. This is due to the fact the exit condition is one that will never be reached due to the parameters of the loop. The loop starts above 0 and never gets closer to that condition only further away */