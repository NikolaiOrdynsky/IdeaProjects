package AleksandrVasko.DataTime;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalUnit;

public class DataTimeLocal {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2016, Month.AUGUST, 28, 22, 59);
        System.out.println(isWeekend(date));
        System.out.println(date.getDayOfWeek());
        Instant instant = Instant.now();
        System.out.println(instant);

    }

    public static boolean isWeekend(LocalDateTime date) {
        boolean result=false;
        if ((date.getDayOfWeek()==DayOfWeek.FRIDAY&&date.getHour()>=22)||date.getDayOfWeek()==DayOfWeek.SATURDAY||(date.getDayOfWeek()==DayOfWeek.SUNDAY&&date.getHour()<23)) {

           result = true;
        }
        return result;
    }
}
