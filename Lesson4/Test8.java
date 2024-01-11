package Lesson4;

public class Test8 {
    public static void main(String[] args) {
        String s = "";
        Boolean b1 = true; // Unboxing
        boolean b2 = false;
        if ((b2 = false) | (21 % 5) > 2) // false
            s += "x";
        if (b1 || (b2 == true)) // true
            s += "y";
        if (b2 == true) // false
            s += "z";
        System.out.println(s);
    }
}