public class Date {

  private int day;
  private int month;
  private int year;

  public Date(){
    day = 0;
    month = 0;
    year = 0;
  }

  public int getDay(){
    return day;
  }

  public int getMonth(){
    return month;
  }

  public int getYear(){
    return year;
  }

  public void setDay(int day){
    this.day = day;
  }

  public void setMonth(int month){
    this.month = month;
  }

  public void setYear(int year){
    this.year = year;
  }
  public void displayDate(){
    System.out.printf("%d/%d/%d", day, month, year);
  }

}
