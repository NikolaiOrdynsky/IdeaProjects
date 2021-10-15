package PracticalTask.Работа_со_строками.Удаление_символов_в_строке;

import java.util.*;
import java.util.stream.Collectors;
public class Troll {
    public static String disemvowel(String str) {
        long a = System.currentTimeMillis();
        String[] stroka = str.split("");
        String[] troll = {"A","a","E","e","I","i","O","o","U","u"};
        List<String> list = new ArrayList<>();
        for(int i=0;i<stroka.length;i++){
            boolean flag =false;
            for(int j=0;j<troll.length;j++){
                if(stroka[i].equals(troll[j])){
                    flag=true;
                }
            }
            if(!flag){
                list.add(stroka[i]);
            }
        }
        String result ="";
        for(String el:list){
            result = result+el;
        }
        long b = System.currentTimeMillis();
        System.out.println(b-a);
        return result;
    }
    public static String disemvowelStream(String str){
        long a = System.currentTimeMillis();
        String[] stroka = str.split("");
        String[] troll = {"A","a","E","e","I","i","O","o","U","u"};
        String collect = Arrays.stream(stroka).filter(x -> Arrays.stream(troll).noneMatch(y -> y.equals(x))).collect(Collectors.joining());
        long b = System.currentTimeMillis();
        System.out.println(b-a);
        return collect;
    }

    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
        System.out.println(Troll.disemvowelStream("This website is for losers LOL!"));

    }
}
