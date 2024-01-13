package Lesson5;

public class Test14 {
    public static void main(String[] args) {
        int j = 7;
        doStuff();
        assert (++j > 7) : "uio"; // 8 > 7 // true
        assert (++j > 8) : "hi"; // 9 > 8 // true
        assert (j > 10) : "xyz"; // 9 > 10 // false // 12
        // assert (j == 12) : doStuff();
        assert (j == 12) : "bh";
    }

    static void doStuff() {
        System.out.println("Hello");
    }
}
