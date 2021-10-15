package PracticalTask.Работа_со_строками.Число_в_строку;

public class Kata {

    public static int persistence(long n) {
            int result=0;
            while(n>=10){
                String[] array = String.valueOf(n).split("");
                n=1;
                for(String el:array){
                    n = n * Integer.parseInt(el);
                }
                result++;
                if(n<10){break;}
            }
            return result;
        }
    public static int persistenceStream(long n) {
        int times = 0;
        while (n >= 10) {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            times++;
        }
        return times;
    }
    public static void main(String[] args) {
        System.out.println(persistence(1564));
    }
}
