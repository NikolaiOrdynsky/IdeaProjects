package PracticalTask.Удаление_символов_в_строке;

import java.util.*;
import java.util.stream.Collectors;
public class Troll {
    public static String disemvowel(String str) {
        String[] stroka = str.split("");
        String[] troll = {"A","a","E","e","I","i","O","o","U","u"};
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for(int i=0;i<stroka.length;i++){
            flag=false;
            for(int j=0;j<troll.length;j++){
                if(stroka[i]!=troll[j]){
                    flag=true;
                }
            }
            if(flag){
                list.add(stroka[i]);
            }
        }
        String result ="";
        for(String el:list){
            result = result+el;
        }
        return result;
    }
    public static String disemvowelStream(String str){
        String[] stroka = str.split("");
        String[] troll = {"A","a","E","e","I","i","O","o","U","u"};

        return Arrays.stream(stroka).filter(x->Arrays.stream(troll).noneMatch(y->y.equals(x))).collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(Troll.disemvowelStream("This website is for losers LOL!"));

    }
}
