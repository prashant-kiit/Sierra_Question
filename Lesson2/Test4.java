package Lesson2;

class Clidder {
    // private final void flipper() {
    //     System.out.println("Clidder");
    // }
}

public class Test4 extends Clidder {
    public final void flipper() {
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new Test4().flipper();
    }
}