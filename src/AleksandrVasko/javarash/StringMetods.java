package AleksandrVasko.javarash;

/**
 * The type String metods.
 */
public class StringMetods {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно 1.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    /**
     * Count digits int.
     *
     * @param string the string
     * @return the int
     */
    public static int countDigits(String string) {
        int temp = 0;
        for(int i =0; i<string.length();i++){
            if(Character.isDigit(string.charAt(i))){
                temp++;
            }
        }
      return temp;
    }

    /**
     * Count letters int.
     *
     * @param string the string
     * @return the int
     */
    public static int countLetters(String string) {
       int temp = 0;
       for(int i =0; i<string.length();i++){
           if(Character.isLetter(string.charAt(i))){
               temp++;
           }
       }
       return temp;
   }

    /**
     * Count spaces int.
     *
     * @param string the string
     * @return the int
     */
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


