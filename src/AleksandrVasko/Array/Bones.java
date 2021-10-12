package AleksandrVasko.Array;

import java.security.SecureRandom;
/*SecureRandom обеспечивает криптографически надежный генератор случайных чисел (RNG).
Криптографически сильное случайное число минимально соответствует статистическим тестам генератора случайных чисел,
 указанным в FIPS 140-2, Требования безопасности для криптографических модулей, раздел 4.9.1. Кроме того,
  SecureRandom должен выдавать недетерминированный вывод. Поэтому любой исходный материал,
  передаваемый объекту SecureRandom, должен быть непредсказуемым, и все выходные последовательности SecureRandom
  должны быть криптографически надежными, как описано в RFC 4086: Требования к случайности для обеспечения безопасности.
*/

/**
 * The type Bones.
 */
public class Bones {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = new int[7];
        for (int i = 0; i < 100; i++) {
            int temp =1+random.nextInt(6);//Возвращает псевдослучайное,
                                                 // равномерно распределенное значение int между 0 (включительно)
                                                 // и указанным значением (исключительным)
            array[temp]=array[temp]+1;
        }
        for(int j=1;j< array.length;j++){
            System.out.println(j+" "+array[j]);

        }    }
}
