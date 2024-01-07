package Lesson2;

class Singer {
    public static String sing() {
        return "la";
    }
}

public class Test10 extends Singer {
    //@Override
    public static String sing() {
        return "fa";
    }

    public static void main(String[] args) {
        Singer s1 = new Singer();
        Test10 t = new Test10();
        Singer s2 = new Test10();
        System.out.println(t.sing() + " " + s1.sing() + " " + s2.sing());
    }
}
