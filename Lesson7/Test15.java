package Lesson7;

// https://stackoverflow.com/questions/52368009/what-is-the-difference-between-step-in-step-out-and-step-over
// https://www.scaler.com/topics/java/java-stack-trace/
// https://www.youtube.com/watch?v=R1F5ihQKL4U

// https://www.geeksforgeeks.org/how-to-avoid-duplicate-user-defined-objects-in-treeset-in-java/
// https://stackoverflow.com/questions/4447461/in-treeset-sorting-uniqueness-of-custom-objects-based-on-different-properties
import java.util.*;

public class Test15 {
    public static void main(String[] args) {
        TreeSet<Dog> d = new TreeSet<Dog>();
        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));
        System.out.println(d);
        System.out.println(d.size());
        TreeSet<Integer> i = new TreeSet<Integer>();
        i.add(1);
        i.add(2);
        i.add(1);
        System.out.println(i.size());
    }
}

class Dog implements Comparable<Dog>{
    int size;

    Dog(int s) {
        size = s;
    }

    @Override
    public int compareTo(Dog o) {
        if (this.size > o.size)
            return 1;
        else if (this.size == o.size)
            return 0; // for uniqueness
        else 
            return -1; 
    }

    // @Override
    // public boolean equals(Object obj) {
    //     return this.size == ((Dog)obj).size;
    // }

    // @Override
    // public int hashCode() {
    //     return 2;
    // }
}