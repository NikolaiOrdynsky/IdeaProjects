package AleksandrVasko.Array;

import java.security.SecureRandom;


public class Bones {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = new int[7];
        for (int i = 0; i < 100; i++) {
            int temp =1+random.nextInt(6);
            array[temp]= array[temp] +1;
        }
        for(int j=1;j< array.length;j++){
            System.out.println(j+" "+array[j]);

        }    }
}
