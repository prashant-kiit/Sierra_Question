package Lesson7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Test3 {
    public static void main(String[] args) {
        before();
    }

    public static void before() {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(2);
        set.add(1);
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next() + " ");
        /*
         * You can't put both Strings and ints into the same TreeSet. Without generics,
         * the compiler has no way of knowing what type is appropriate for this TreeSet,
         * so it allows
         * everything to compile. At runtime, the TreeSet will try to sort the elements
         * as they're
         * added, and when it tries to compare an Integer with a String it will throw a
         * ClassCastException
         */
    }
}