package AleksandrVasko.math_operacii;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comp implements Comparator<Comp> {
    @Override
    public int compare(Comp o1, Comp o2) {
        return 0;
    }
}
class Main{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 2, 13, 4, 15, 6);

        numbers.sort((i1, i2) -> !i1.equals(i2) ? 0 : i2 - i1);

        System.out.println(numbers);
    }
}