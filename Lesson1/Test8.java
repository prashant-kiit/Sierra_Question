package Lesson1;
public class Test8 {
    public enum Days {
        MON, TUE, WED
    };

    public static void main(String[] args) {
        for (Days d : Days.values())
            System.out.println(d.name());
        Days[] d2 = Days.values();
        System.out.println(d2[2]);
    }
}
