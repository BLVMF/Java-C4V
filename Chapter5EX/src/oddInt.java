import java.util.ArrayList;



public class oddInt {
  public static void main(String[] args){
    ArrayList<Integer> oddList = new ArrayList<Integer>();

      for(int i = 0; i < 16; i++) {
       if (i % 2 == 0){
         continue;
       } else{
         oddList.add(i);
       }
      }
  int result = oddList.stream().reduce(1, (a,b)-> a * b);
  System.out.println("The product of multiplying all odd numbers from 1 - 15 is: " + result);

  }
 
}