package AleksandrVasko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
//        List<Double> numbers = new ArrayList<>(List.of(6.28, 5.42, 84.0, 26.0));
//        numbers.add(3.5);
//        System.out.println(numbers);
//        Stream.iterate(1, i -> i + 2)
//                .skip(5)
//                .limit(5)
//                .forEach(n -> System.out.print(n + " "));
        List<Character> characters =
                Arrays.asList('z', '1', 'e', 'Z', 'q', 'd', '8', 'E');


//        long count = characters.stream()
//                .filter(Character::isLetter)
//                .map(Character::toUpperCase)
//                .filter(c -> c != 'E')
//                .count();
        Map<Integer, List<Integer>> collect = Stream.of(1, 2, 1, 3, 2, 4).collect(Collectors.groupingBy(Function.identity()));
        System.out.println(collect);
    }
}
