package PracticalTask.Работа_со_строками.Сравнение_строк;



public class Kata {
    public static boolean solution(String str, String ending) {

        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("привет","вет"));
    }
}
