package Lesson7;

// https://www.geeksforgeeks.org/equals-hashcode-methods-java/

class Test2 {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        System.out.println(a == b);    
        // System.out.println(a.equals(b)); // Exception : Cannot invoke equals(int) on the primitive type int

        Integer aa = 9;
        Integer bb = 9;
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));

        String s1 = "Hello";
        s1+="!";
        String s2 = "Hello";
        s2+="!";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        MyMap m1 = new MyMap(2);
        MyMap m2 = new MyMap(2);
        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        MyMap m11 = new MyMap(2);
        MyMap m22 = m11;
        System.out.println(m11 == m22);
        System.out.println(m11.equals(m22));
        System.out.println(m11.hashCode());
        System.out.println(m22.hashCode());


    }
}

class MyMap {
    private int a;
    public MyMap(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return this.a + "";
    }

    @Override
    public boolean equals(Object o) {
        return this.getClass() == o.getClass() && this.a == ((MyMap)o).a;
    }

    @Override
    public int hashCode() {
        return 1;
    }

}