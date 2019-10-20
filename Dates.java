import java.time.*;

public class Dates {
  public static void main (String[] args) {
    LocalDate date = LocalDate.of(2018, Month.APRIL, 31);
    System.out.println(date.getYear() + " " + date.getMonth() + " " +
        date.getDayOfMonth());
  }
}  
