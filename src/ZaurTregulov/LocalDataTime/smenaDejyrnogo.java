package ZaurTregulov.LocalDataTime;
import java.time.LocalDate;
import java.time.Period;

public class smenaDejyrnogo {
   static void setSmena(LocalDate nachalo, LocalDate konec, Period p){
        LocalDate data= nachalo;
        while (data.isBefore(konec)){ // пока дата начало раньше даты конец, выполнять тело цикла.
            System.out.println("Наступила дата "+data+" пора менять дежурного.");
            data = data.plus(p); //объекту дата прибавить опеределенный  период.
        }

    }

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2021,9,19);
        LocalDate ld2 = LocalDate.of(2022,6,19);
        setSmena(ld1,ld2,Period.ofMonths(1)); // использование класса период и его метода ofMonths.
    }
}
