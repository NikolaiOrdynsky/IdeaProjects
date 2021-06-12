package javaRush;

public class Test {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно 1.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int temp = 0;
        for(int i =0; i<string.length();i++){
            if(Character.isDigit(string.charAt(i))){
                temp++;
            }
        }
      return temp;
    }

   public static int countLetters(String string) {
       int temp = 0;
       for(int i =0; i<string.length();i++){
           if(Character.isLetter(string.charAt(i))){
               temp++;
           }
       }
       return temp;
   }

        public static int countSpaces(String string) {
            int temp = 0;
           for(int i =0; i<string.length();i++){
               if(Character.isWhitespace(string.charAt(i))){
                   temp++;
               }
           }
           return temp;
        }
}


