package Lesson5;



public class Test9 extends Infinity {

    public void fun2() {
        System.out.println("child class");
    }

    public void fun3() {
        System.out.println("child overidden class");
    }

    static Integer i;

    public static void main(String[] args) {
        int sw = (int) (Math.random() * 3); // 0 1 2
        switch (sw) {
            case 0: { // Infinite Loop
                for (int x = 10; x > 5; x++)
                    if (x > 10000000)
                        x = 10;
                break;
            }
            case 1: { // Error: java.lang.NullPointerException
                int y = 7 * i;
                System.out.println(y);
                break;
            }
            case 2: {
                Infinity inf = new Test9();
                inf.fun1();
                inf.fun3();
                Test9 b = (Test9) inf;
                b.fun1();
                b.fun2();
                b.fun3();
                System.out.println(b);
            }
        }
    }
}

class Infinity {
    public void fun1() {
        System.out.println("parent class");
    }
    public void fun3() {
        System.out.println("parent hidden class");
    }
}