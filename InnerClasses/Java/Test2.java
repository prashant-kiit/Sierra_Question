package InnerClasses.Java;
// https://www.youtube.com/watch?v=WE01T8okZTA
// https://www.geeksforgeeks.org/nested-classes-in-c/
// https://www.geeksforgeeks.org/inner-class-java/
// https://www.geeksforgeeks.org/interface-nested-class-another-interface/
public class Test2 {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        System.out.println(o1.getS());
        System.out.println(o1.getI());
        System.out.println(o1.getI().getS1());

        Outer o2 = new Outer();
        System.out.println(o2.getS());
        System.out.println(o2.getI());
        System.out.println(o2.getI().getS1());       

        Outer.Inner inn = new Outer().new Inner();
        System.out.println(inn.getS1());

        Outer.Inner2 inn2 = new Outer.Inner2();
        inn2.getS2();
    }
}

class Outer {
    private String s = "Outer Class";
    class Inner {
        private String s= "Inner Class";
        public String getS1() {
            return this.s;
        }
        String x = getS();
    }
    private Inner i = new Inner();

    static class Inner2 {
        private String s = "Inner2 class";
        public String getS2() {
            return this.s;
        }
    }

    public String getS() {
        return this.s;
    }

    public Inner getI() {
        return this.i;
    }
}
