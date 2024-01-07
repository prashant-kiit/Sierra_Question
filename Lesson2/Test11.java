package Lesson2;

class Alpha {
    static String s = " ";

    protected Alpha() {
        s += "alpha ";
    }
}

class SubAlpha extends Alpha {
    private SubAlpha() {
        s += "sub ";
    }
}

public class Test11 extends Alpha {
    private Test11() {
        s += "subsub ";
    }
    public static void main(String[] args) {
        new Test11();
        System.out.println(s);
    }
}