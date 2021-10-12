package AleksandrVasko.javarash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type Url edit.
 */
public class UrlEdit {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int a = url.indexOf("?");
        String s = url.substring(a + 1);
        String[] split = s.split("&");

        for (int i = 0; i < split.length; i++) {
            int i3 = split[i].indexOf("=");
            if (split[i].contains("=")) {
                alert(split[i].substring(0, i3));
            } else {
                alert(split[i]);
            }

        }
        if (split[0].contains("obj")) {
            int i3 = split[0].indexOf("=");
            String str = split[0].substring(i3 + 1);
            System.out.println("\n");
            alert(Double.parseDouble(str));
        }
    }

    /**
     * Alert.
     *
     * @param value the value
     */
    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    /**
     * Alert.
     *
     * @param value the value
     */
    public static void alert(String value) {
        System.out.print( value+" ");
    }
}
//htpp://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
//htpp://javarush.ru/alpha/index.html?obj=3.6&view&name=Amigo