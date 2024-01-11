package Lesson4;

class Feline {
    public static void main(String[] args) {
        Long x = 42L;
        Long y = 44L;
        System.out.println("a" + 7 + 2 + "b");
        System.out.println(foo() + x + 5 + "c");
        System.out.println(x + y + foo()); // Note: x and y are auto-unboxed
    }

    static String foo() {
        return "foo";
    }
}