package AleksandrVasko.Collections.СomparatorCompareTo;

import java.util.List;


   public class Utils {

        public  static void sortStrings(List<String> strings) {
            strings.sort((a,b)->b.compareTo(a));
            System.out.println(strings);
        }



}
