package AleksandrVasko.ObjectMethods.Cloneable;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Tree tree = new Tree("willow", new String[]{"s1", "s2", "s3", "s4"});
        Tree clone = null;
        try {
            clone = (Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        System.out.println(tree.branches.equals(clone.branches));
        System.out.println(Arrays.toString(clone.branches)+Arrays.toString(tree.branches));
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Tree extends Plant implements Cloneable {
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Tree o = (Tree)super.clone();
            if(o.branches!=null) {
                o.branches = o.branches.clone();
                return o;
            }else{
                o.branches = null;
            }
            return o;
        }
    }
}



