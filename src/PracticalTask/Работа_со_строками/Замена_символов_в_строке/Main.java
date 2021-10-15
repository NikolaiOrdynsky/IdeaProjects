package PracticalTask.Работа_со_строками.Замена_символов_в_строке;

public class Main {
    public static String correct(String string) {
        String i = string.replace("1", "I");
        String s = i.replace("5", "S");
        String replace = s.replace("0", "O");
        return replace;
    }

    public static String correctPro(String string) {

        return string.replace("1", "I").replace("5", "S").replace("0", "O");
    }
    public static void main(String[] args) {
        System.out.println(correctPro("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
    }
}
