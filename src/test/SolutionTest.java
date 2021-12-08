package test;

import PracticalTask.Работа_с_массивами.Поиск_прямоугльников_в_двумерном_массиве.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getRectangleInArray() {

        byte[][] a1 = new byte[][]{
                {1, 1, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };
        int count = Solution.getRectangleCount(a1);

        assertEquals(4,count);

    }


}