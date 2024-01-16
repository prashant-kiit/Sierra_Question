package Lesson7;

// https://www.tutorialspoint.com/java/util/arrays_binarysearch_super.htm#:~:text=The%20Java%20Arrays%20binarySearch(T,sorted%2C%20the%20results%20are%20undefined.

import java.util.*;

public class Test16 {
    public static void main(String[] args) {
        String[] s = { "map", "pen", "marble", "key" };
        System.out.println(s);
        Othello o = new Othello();
        Arrays.sort(s, o);
        System.out.println(s);
        for (String s2 : s)
            System.out.print(s2 + " ");
        System.out.println(Arrays.binarySearch(s, "map")); // the binarySearch() gives –1 because it needs to be
        // invoked using the same Comparator (o), as was used to sort the array
        
        // String[] s = { "H", "E" };
        // System.out.println(Arrays.binarySearch(s, "H"));
    }

    static class Othello implements Comparator<String> {
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}