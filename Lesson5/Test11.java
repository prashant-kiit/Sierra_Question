package Lesson5;

public class Test11 {
    static String s = ""; // 123

    public static void main(String[] args) {
        try {
            s += "1";
            throw new Exception();
        } catch (Exception e) {
            s += "2";
        } finally {
            s += "3";
            doStuff();
            s += "4";
        }
        System.out.println(s);
    }

    static void doStuff() {
        int x = 0;
        try {
            int y = 7 / x;
            System.out.println(y);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}