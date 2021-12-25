package AleksandrVasko.ObjectMethods.Cloneable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Solution1 implements Cloneable {
    protected Map<String, User> users = new LinkedHashMap();
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution1 clone = null;
        try {
            clone = (Solution1) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution1 clon = (Solution1) super.clone();
        Map<String, User> user = new LinkedHashMap();
        user.putAll(users);
        clon.users=user;
        return clon;
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            return (User)super.clone();
        }

        @Override
        public int hashCode() {
            if (name != null) {
                return name.hashCode() + Objects.hashCode(age);
            }
            return -1;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            User s = (User) obj;
            if (!(age == s.age || (age != 0 && age == s.age))) return false;
            return (name == s.name || (name != null && name.equals(s.name)));
        }
    }
}