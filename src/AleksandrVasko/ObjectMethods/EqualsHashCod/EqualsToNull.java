package AleksandrVasko.ObjectMethods.EqualsHashCod;

import java.util.HashSet;
import java.util.Set;

public class EqualsToNull {

    private final String first;
    private final String last;

    public EqualsToNull(String first, String last) {
        this.first = first;
        this.last = last;
    }
/**Метод сравнивает все поля обьекта, делает проверку на null несколькими способами.*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsToNull s = (EqualsToNull) o;
        /*если first не null,тогда сравниваем first и s.first
         если они равны  тогда меняем значение на false, тем
         самым выходим из if.
         иначе проверяем s.first на null*/
        /**Objects.equals(first,s.first)&&Objects.equals(last,s.last);
         * */
        /**if(first!=null?!(first.equals(s.first)):s.first!=null) return false;
         * return last!=null?last.equals(s.last):s.last!=null
         * */
        if(!(first==s.first||(first!=null&&first.equals(s.first))))
            return false;
        return (last==s.last||(last!=null&&last.equals(s.last)));
    }

    @Override
    public int hashCode() {
        if (this.first != null && this.last != null) {
            return first.hashCode() + last.hashCode();
        }
        return -1;
    }

    public static void main(String[] args) {
        Set<EqualsToNull> s = new HashSet<>();

        s.add(new EqualsToNull(null, "Duck"));
        System.out.println(s.contains(new EqualsToNull(null, "Duck")));
    }

}
