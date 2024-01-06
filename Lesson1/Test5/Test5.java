package Lesson1.Test5;

import Lesson1.Test4.*;

public class Test5 {
    public static void main(String[] args) {
        Test4 f = new Test4();
        // System.out.print(" " + f.a); // error: private 
        // System.out.print(" " + f.b); // error: protected
        System.out.println(" " + f.c);
    }
}