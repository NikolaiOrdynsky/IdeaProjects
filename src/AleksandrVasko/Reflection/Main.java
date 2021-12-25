package AleksandrVasko.Reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class test = Class.forName("AleksandrVasko.Collections.Map.HashMap.Word");
//        Method[] methods = test.getMethods();
//        for(Method el:methods){
//            System.out.printf("Name %s, Parametrs %s+\n",el.getName(),Arrays.toString(el.getParameters()));
//
//        }
        System.out.println("*************************************");
        Field[] fields = test.getDeclaredFields();
        for(Field el:fields){
            System.out.printf("Name %s\n",el.getName());

        }
    }
}
