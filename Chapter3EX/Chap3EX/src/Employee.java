public class Employee{
  private String firstName;
  private String lastName;
  private double salary;

  /*Set default values */
  public Employee(){
    firstName = "None";
    lastName = "None";
    salary = 0.0;
  }

  /* Acessor Methods */
  public String getFirstName(){
    return firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public double getSalary(){
    return salary;
  }

  /*Mutation Methods */

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setSalary(double salary){
    this.salary = salary;
  }

  /*Calculate annual salary */

  public double getAnnualSalary(){
    return salary * 12;
  }

  public double getRaise(){
    return (salary * 12) + (salary * 12 * .10);
  }

}