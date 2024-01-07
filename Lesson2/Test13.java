package Lesson2;

class Mammal {
    String name = "furry ";

    String makeNoise() {
        return "generic noise";
    }
}

class Zebra extends Mammal {
    String name = "stripes ";

    @Override
    String makeNoise() {
        return "bray";
    }
}

public class Test13 {
    public static void main(String[] args) {
        new Test13().go();
    }

    void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }
}