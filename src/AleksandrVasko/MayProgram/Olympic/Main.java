package AleksandrVasko.MayProgram.Olympic;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static NavigableMap<String, Sportsmen> map = new TreeMap<>();

    public static void main(String[] args) {

        addSportsmen(createSportsmen());
        run(map);
    }

    private static List<Sportsmen> createSportsmen() {
        return List.of(
                new Sportsmen("Mike", "USA", TypeSport.RUN, 18, 20, 33, 30),
                new Sportsmen("Nik", "USA", TypeSport.RUN, 19, 22, 32, 28),
                new Sportsmen("Sam", "USA", TypeSport.RUN, 17, 23, 31, 33),
                new Sportsmen("Yill", "USA", TypeSport.JAMP, 20, 24, 30, 35),
                new Sportsmen("Garri", "USA", TypeSport.JAMP, 21, 25, 29, 40)
        );
    }

    public static void addSportsmen(List<Sportsmen> sp) {
        for (var s : sp) {
          map.put(s.name,s);

        }

    }

    public static void run(Map<String, Sportsmen> map) {
        List<Sportsmen> list = new ArrayList<>();
        for (Map.Entry<String, Sportsmen> s : map.entrySet()) {
            if(s.getValue().typeSport==(TypeSport.RUN)){
                list.add(s.getValue());
            }

        }
        List<Sportsmen> collect = list.stream().sorted((s1,s2) -> s2.agility- s1.agility).collect(Collectors.toList());
        System.out.println("Name        "+"Count      "+"Sport       "+"age        "+"Agility    "+"Strength   "+"Expirience");
        System.out.println(collect);

        System.out.println("Победитель "+collect.get(0));
    }
}
