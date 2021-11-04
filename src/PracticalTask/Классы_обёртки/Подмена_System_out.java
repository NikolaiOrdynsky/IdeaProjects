package PracticalTask.Классы_обёртки;

import java.beans.Expression;
import java.io.*;
import java.util.Arrays;

public class Подмена_System_out {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        reader.close();

        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        FileOutputStream writer = new FileOutputStream(path);

        PrintStream out = System.out;
        PrintStream newOut = new PrintStream(byteArray);
        System.setOut(newOut);
        printSomething();
        System.setOut(out);
        String s = byteArray.toString();
        char[] chars = s.toCharArray();
        for(char el:chars){
            writer.write(el);
            Math.random();
        }
        System.out.println(s);
        byteArray.close();
        writer.close();
    }

    public static String stringMod1(String st) {
        return st.replaceAll("\\D", "");
    }

    public static String stringMod2(String st) {
        return st.replaceAll("te", "??");
    }

    public static int stringMod3(String st) {
        String noSimvol = st.replaceAll("[a-zA-Zа-яА-Я]", "");
        String[] split = noSimvol.split(" ");
        int result = Integer.parseInt(split[0]);
        for (int i = 0; i < split.length; i++) {
            switch (split[i]) {
                case "+": {
                    result = result + Integer.parseInt(split[i + 1]);
                    break;
                }
                case "-": {
                    result = result - Integer.parseInt(split[i + 1]);
                    break;
                }
                case "*": {
                    result = result * Integer.parseInt(split[i + 1]);
                    break;
                }
                case "/": {
                    result = result / Integer.parseInt(split[i + 1]);
                    break;
                }
                case "=": {
                    break;
                }
            }
        }
        return result;
    }


    public static void printSomething() {
        System.out.println("it's a text for testing");
    }


}
