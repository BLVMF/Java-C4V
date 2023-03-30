import java.util.Scanner;

public class EmployeeTest {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    String first;
    String last;
    double sal;

    Employee Employee1 = new Employee();
    Employee Employee2 = new Employee();

    /*Employee 1 details */
    System.out.println("Employee 1");
    System.out.println("Enter new employee's first name: ");
    first = scnr.nextLine();

    System.out.println("Enter new employee's last name: ");
    last = scnr.nextLine();

    System.out.println("Enter new employee's monthly salary: ");
    sal = scnr.nextDouble();

    Employee1.setFirstName(first);
    Employee1.setLastName(last);

    /*if salary < 0 don't set it */

    if(sal > 0) {
      Employee1.setSalary(sal);
    }

    System.out.println("Employee Summary");
    System.out.println("First Name: " + Employee1.getFirstName());
    System.out.println("Last Name: " + Employee1.getLastName()); 
    System.out.println("Monthly Salary: " + Employee1.getSalary());
    System.out.println("Annual Salary: " + Employee1.getAnnualSalary());
    System.out.println("After a 10% increase your salary is: " + Employee1.getRaise());
    System.out.println();
    System.out.println("------------------------------------------------");
    System.out.println();

    /*Employee 2 details */
    System.out.println("Employee 2");
    System.out.println("Enter new employee's first name: ");
    scnr.nextLine();
    first = scnr.nextLine();

    System.out.println("Enter new employee's last name: ");
    last = scnr.nextLine();

    System.out.println("Enter new employee's monthly salary: ");
    sal = scnr.nextDouble();

    Employee2.setFirstName(first);
    Employee2.setLastName(last);

    /*if salary < 0 don't set it */

    if(sal > 0) {
      Employee2.setSalary(sal);
    }

    System.out.println("Employee Summary");
    System.out.println("First Name: " + Employee2.getFirstName());
    System.out.println("Last Name: " + Employee2.getLastName()); 
    System.out.println("Monthly Salary: " + Employee2.getSalary());
    System.out.println("Annual Salary: " + Employee2.getAnnualSalary());
    System.out.println("After a 10% increase your salary is: " + Employee2.getRaise());


  }
  
}
