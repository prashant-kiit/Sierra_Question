package Lesson5;

public class Test16 extends Tire {
    public static void main(String[] args) {
        new Test16().doStuff();
    }

    void doStuff() throws ArithmeticException {

        System.out.println(7 / 0);

    }
}

class MyException extends Exception {

}

class Tire {
    void doStuff() throws Exception{
    }
}
