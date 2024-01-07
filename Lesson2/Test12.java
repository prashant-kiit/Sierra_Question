package Lesson2;

class Building {
    Building() {
        System.out.print("b ");
    }

    Building(String name) {
        this();
        System.out.print("bn " + name);
    }
}

public class Test12 extends Building {
    Test12() {
        System.out.print("h ");
    }

    Test12(String name) {
        this();
        System.out.print("hn " + name);
    }

    public static void main(String[] args) {
        new Test12("x ");
        new Building("x");
    }
}