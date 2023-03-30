import java.util.Scanner;

public class BMITest {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String firstName, lastName, birthMonth, sex;

    int birthDay, birthYear, age, height, weight, maxHeartRate;

    System.out.print("Enter first name: ");
    firstName = input.nextLine();

    System.out.print("Enter last name: ");
    lastName = input.nextLine();

    System.out.print("Enter birth month: ");
    birthMonth = input.nextLine();

    System.out.print("Enter Sex: ");
    sex = input.nextLine();

    System.out.print("Enter day of birth: ");
    birthDay = input.nextInt();

    System.out.print("Enter year of birth: ");
    birthYear = input.nextInt();

    System.out.print("Enter height in inches: ");
    height = input.nextInt();

    System.out.print("Enter weight in pounds: ");
    weight = input.nextInt();

    BMI person1 = new BMI(firstName,lastName, birthMonth, sex, birthDay, birthYear, height, weight);

    age = person1.getAge();

    System.out.printf("%s's Maximum Heart Rate: %d%n", person1.getFirstName(), person1.getMaxHeartRate(age));
        System.out.println(person1.getTargetHeartRate(age));

  }
  
}
