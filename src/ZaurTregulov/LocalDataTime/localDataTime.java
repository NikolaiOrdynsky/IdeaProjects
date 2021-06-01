package ZaurTregulov.LocalDataTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class localDataTime {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now()); // создание объекта класса дата и время в данный момент времени.

        LocalDateTime ld1 = LocalDateTime.of(2021, 4, 19, 18, 17, 35, 999999999);
        // создание объекта класса дата и время с указанными аргументами.

        LocalDate ld2 = LocalDate.now();
        LocalTime lt1 = LocalTime.now();
        LocalDateTime ld3 = LocalDateTime.of(ld2, lt1);


        // объекты классов дата и время immutable "неизменяемые"

        LocalDate ld4 = LocalDate.of(2021, Month.APRIL, 19);

        ld4.plusDays(11); // так нельзя изменить immutable объект
       // System.out.println(ld4);

        LocalDate ld5 = ld4.plusDays(11); // присвоить значение новому объекту будет правильно.
       // System.out.println(ld5);

        LocalDate ld6 = ld4.plusWeeks(1); // прибавить неделю
        LocalDate ld7 = ld4.plusMonths(1);// прибавить месяц
        int ld8 = ld4.getDayOfYear(); // день в году
        //System.out.println(ld1.isAfter(ld3));//cравнение объектов, какой объект произошел раньше ld1 или ld2
        Period p = Period.of(1, 2, 10); // создание периода в 1 год, 2 месяца, 10 дней.
        Duration в = Duration.ofHours(2); //создание периода 2 часа.
        ld4.getDayOfMonth();// возвращает 19 апреля.
        ld4.getDayOfYear();// возвращает 109 день в году.

        // System.out.println(ld4.format(DateTimeFormatter.ISO_WEEK_DATE)); // форматирование объекта LocalDataTime в определенный формат.
        System.out.println(ld1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))); // форматирование объекта LocalDataTime в другой стиль.
    }
}
