package Lesson3;

class Test1 {
    Short story = 200;

    Test1 go(Test1 cb) {
        cb = null;
        return cb;
    }

    public static void main(String[] args) {
        Test1 c1 = new Test1();
        Test1 c2 = new Test1();
        Test1 c3 = c1.go(c2);
        c1 = null;
        System.out.println(c3);
    }
}