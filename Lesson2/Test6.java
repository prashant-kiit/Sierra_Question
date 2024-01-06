package Lesson2;

class X {
    void do1() {
        System.out.println("Prashant");
    }
}

class Y extends X {
    void do2() {
        System.out.println("Chinku");
    }
}

class Chrome {
    public static void main(String[] args) {
        X x1 = new X();
        x1.do1();
        Y y1 = new Y();
        y1.do1();
        y1.do2();
        X x2 = new Y();
        x2.do1();
        ((Y)x2).do2();
    }
}