import java.time.Year;

public class BMI {
  public static final int CURRENT_YEAR = Year.now().getValue();

  private String firstName, lastName, birthMonth, sex;

  private int birthDay, birthYear, height, weight;

  public BMI(String firstName, String lastName, String birthMonth, String sex, int birthDay, int birthYear, int height, int weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthMonth = birthMonth;
    this.sex = sex;
    this.birthDay = birthDay;
    this.birthYear = birthYear;
    this.height = height;
    this.weight = weight;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getFirstName(){
    return firstName;
  }
  public String getLastName() {
    return lastName;
   }

  public void setBirthMonth(String birthMonth) {
    this.birthMonth = birthMonth;
  }

  public String getBirthMonth() {
    return birthMonth;
  }

  public void setsex(String sex) {
    this.sex = sex;
  }

  public String getsex() {
    return sex;
  }

  public void setBirthDay(int birthDay) {
    this.birthDay = birthDay;
  }

  public int getBirthDay() {
    return birthDay;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setHeight(int height) {
    this.height = height;
  }
  
  public int getHeight() {
    return height;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  

  public int getAge() {
    return CURRENT_YEAR - this.birthYear;
  }

  public int getMaxHeartRate(int age) {
    return 220 - age;
  }
  
  public String getTargetHeartRate(int age) {
    String range;
    int maxHeartRate = getMaxHeartRate(age);
    float yourBMI = (weight * 703) / (height * height);
    int lowRange = (int) (maxHeartRate * 0.50);
    int highRange = (int) (maxHeartRate * 0.80);
    range = this.getFirstName() + "'s Target Heart Rate Range is " + lowRange + " - " + highRange + ". Your BMI is: " + yourBMI;
    return range;
  }


  
}
