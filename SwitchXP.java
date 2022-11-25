
/* Read day of week in Java 
   https://docs.oracle.com/javase/8/docs/api/java/time/DayOfWeek.html
*/
import java.time.DayOfWeek;
import java.util.Calendar;

public class SwitchXP {

  public static void run() {
    Calendar calendar = Calendar.getInstance();
    int today = calendar.get(Calendar.DAY_OF_WEEK);
    DayOfWeek day = DayOfWeek.of(today);
    System.out.println("today is:" + day);
    var isWeekend = switch (day) {
      case MONDAY,
          TUESDAY,
          WEDNESDAY,
          THURSDAY,
          FRIDAY ->
        false;
      case SUNDAY -> true;
      case SATURDAY -> true;
      default -> throw new 
        IllegalStateException("Invalid day: " + day);
    };
    if (isWeekend)
      System.out.println("Have a nice weekend");
    else
      System.out.println("Have a nice day");
  }
}