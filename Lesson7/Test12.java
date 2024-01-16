package Lesson7;

import java.util.TreeSet;
// https://stackoverflow.com/questions/9345651/ordering-of-elements-in-java-hashset
public class Test12 {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");
        System.out.println(s);
        // System.out.println(s.subSet("b", true, "d", true).getClass());
        TreeSet<String> subs = new TreeSet<String>();
        subs = (TreeSet<String>) s.subSet("b", true, "d", true);
        System.out.println(subs);
        s.add("g");
        s.pollFirst();
        s.pollFirst();
        s.add("c2");
        System.out.println(s);
        System.out.println(subs);
        System.out.println(s.size() + " " + subs.size());
    }
}
