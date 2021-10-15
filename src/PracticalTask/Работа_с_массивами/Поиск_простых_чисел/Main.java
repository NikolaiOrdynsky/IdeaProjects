package PracticalTask.Работа_с_массивами.Поиск_простых_чисел;

public class Main {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i ++){
            boolean isPrime = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){//если число i делится на какое либо число от 2 до i-1 без остатка...
                    isPrime = false;//...то ставим флажок на false и выходим из цикла.
                    break;
                }
            }
            if(isPrime){//если же цикл закончился и флажок остался true значит выводим число на экран - оно простое.
                System.out.println(i);
            }
        }
    }
}
