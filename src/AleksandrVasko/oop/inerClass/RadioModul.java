package AleksandrVasko.oop.inerClass;

/*
1. Класс RadioModul состоит из метода call который принимает параметр, этот параметр с помощью инер класса и его методов
  должен быть провалидирован на опр. условия.
2. Класс GsmModul содержит два приватных поля, одно поле - принимаемый номер в параметр конструктора класса, для валидации,
  и поле принимаемое значение уже валидного номера.
3. Класс так же содержит два метода, validNumber - проверяет кол-во символов в номере,
  и возвращает true если номер состоит из цифр. Метод callIn запускает метод valNumber и выводит сообщение .
4. В методе call создать объект инеркласса и с помощью объекта запустить метод callIn.
 */
public class RadioModul {
    RadioModul() {
        System.out.println("Радио модуль инициализирован. ");
    }

    public void call(String number) {

        class GsmModul {
            private String phoneNumber;
            private int validNumber;

            public GsmModul(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public boolean valNumber() {
                if (phoneNumber.length() != 10) {
                    return false;
                } else {
                    validNumber = Integer.parseInt(phoneNumber);

                    return true;
                }
            }

            public void callIn() {
                if (valNumber()) {
                    System.out.println("Происходит звонок по номеру " + validNumber);
                } else {
                    System.out.println("Звонок не может быть совершён по номеру " + phoneNumber);
                }
            }
        }
            GsmModul modul = new GsmModul(number);
            modul.callIn();

    }
}
