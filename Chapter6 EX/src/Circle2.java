import java.util.Scanner;

public class Circle2 {
  static Scanner input = new Scanner(System.in);
 
  
  
  public static void main(String[] args) {
    System.out.println("Enter a radius for your cicrcle: ");
    float rad = input.nextFloat();
    circleArea(rad);
  }
  
  public static float circleArea(float rad){
    float pi = (float) Math.PI;
    float area = pi * (rad * rad);
    System.out.printf("The area of the circle of a circle with a radius of %f is %.3f", rad,area);
    return area;
  }
}
