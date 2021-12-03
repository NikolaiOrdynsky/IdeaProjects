package test;

import AleksandrVasko.Collections.СomparatorCompareTo.Utils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void sortStrings() {
        List<String> list = new ArrayList<>(List.of("apple","grape","pear","banana","pineapple"));
        List<String> list2 = new ArrayList<>(List.of("pineapple","pear","grape","banana","apple"));
        Utils.sortStrings(list);
        assertEquals(list2,list);
    }
}