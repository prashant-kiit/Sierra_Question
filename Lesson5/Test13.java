package Lesson5;

public class Test13 {
    public static void main(String[] args) {
        // new Test13().go(); 
        try {
            new Test13().go(); // stack overflow
        } catch (Error e) {
            System.out.println("ouch");
        }
        // try {
        //     new Test13().go();
        // } catch (Exception e) {
        //     System.out.println("ouch");
        //     // System.out.println(e.getStackTrace());
        // }
    }

    void go() {
        go();
    }
}