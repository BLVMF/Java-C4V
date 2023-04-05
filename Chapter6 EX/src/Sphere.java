import java.util.Scanner;

public class Sphere{
   public static void main(String[] args) {
    // get radius from user 
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("Please enter the radius of the sphere");

    Double radius = scnr.nextDouble();
    System.out.printf("Volume is %f%n: ", sphereVolume( radius));
  }
  // Calculate sphere volume

  public static Double sphereVolume(double radius) {
    Double volume =  (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    return volume;
  }

}