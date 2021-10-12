package AleksandrVasko.Array.arrayWork.arrayWork2;

/**
 * The type String.
 */
public class string {
    /**
     * Email.
     *
     * @param str the str
     */
    public static void email(String str){
        int a;
        int b;
        int g;
            for (int j=0;j<str.length()-1;j+=g){
               a = str.indexOf('@',j) ;
              b = str.indexOf('.',j);
              g = str.indexOf(';',j);
                System.out.println(str.substring(a+1,b));
        }




    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
      email("yaas@mail.com;afa@yahho.com;dgfhd@yandex.ru");
    }
}
