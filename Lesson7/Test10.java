package Lesson7;

// https://www.geeksforgeeks.org/treeset-in-java-with-examples/
// https://stackoverflow.com/questions/28538866/compare-different-object-types-with-comparator
// https://www.geeksforgeeks.org/creating-treeset-with-comparator-by-user-define-objects-in-java/

import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        Set s = new TreeSet(new MyCompare());
        s.add("o");
        s.add(new Object());
    }
}
class MyCompare implements Comparator<Object>{
    @Override
    public int compare(Object o1, Object o2) {
        System.out.println("-"+o1.getClass());
        System.out.println("+"+o2.getClass());
        return 1;
    }
    
}


// Set s = new HashSet(); // compiles and executes
// TreeSet s = new TreeSet(); // compiles but run fails
// LinkedHashSet s = new LinkedHashSet(); // compiles and executes