package Lesson4;

// https://www.geeksforgeeks.org/instanceof-keyword-in-java/

public class Test10 {
    public static void main(String[] args) {
        // A a = new A();
        // a.funA();
        // A aa = new B();
        // aa.funA();
        // ((A) new B()).funA();
        // B b = new B();
        // b.funA();
        // b.funB();

        String s = "0";
        Boat b = new Boat();
        Boat b2 = new Speedboat();
        Speedboat s2 = new Speedboat();
        if ((b instanceof Vessel) && (b2 instanceof Toy))
            s += "1";
        if ((s2 instanceof Vessel) && (s2 instanceof Toy))
            s += "2";
        System.out.println(s);
    }
}

interface Vessel {
    public void fun();
}

interface Toy {
    public void foo();
}

class Boat implements Vessel {
    public void fun() {
    }
}

class Speedboat extends Boat implements Toy {
    @Override
    public void foo() {
        throw new UnsupportedOperationException("Unimplemented method 'foo'");
    }
}

class A {
    public void funA() {
        System.out.println("funA of A");
    }
}

class B extends A {
    @Override
    public void funA() {
        System.out.println("funA of B");
    }

    public void funB() {
    }
}
