package Lesson3;

public class Test13 {
    int x = 3;

    public static void main(String[] args) {
        new Test13().go1();
    }

    void go1() {
        // int x;
        int x = 0;
        go2(++x);
    }

    void go2(int y) {
        int x = ++y;
        System.out.println(x);
    }
}