package InnerClasses.Java;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Checker().s);
        System.out.println(new Checker().s);
    }
}

class Hello {

}

class Checker {
    Hello s = new Hello();
}
