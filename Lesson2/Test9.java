package Lesson2;

class Tree {
    public void check() {
        System.out.println("Check Tree");
    }
}

public class Test9 extends Tree {
    @Override
    public void check() {
        System.out.println("Check Test9");
    }

    public static void main(String[] args) {
        new Test9().go();
    }

    void go() {
        go2();
        go3();
    }

    void go2() {
        Tree t2 = (Tree) new Test9();
        t2.check();
        // Test9 r2 = (Test9) new Tree(); // Error: class Lesson2.Tree cannot be cast to
        // class Lesson2.Test9 (Lesson2.Tree and Lesson2.Test9 are in unnamed module of
        // loader 'app')
    }

    void go3() {
        // Test9 r2 = (Test9) (Test9) new Tree(); // Similar to : Test9 r2 = (Test9) new
        // Tree();
    }
}
