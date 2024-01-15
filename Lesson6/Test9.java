package Lesson6;

// https://www.geeksforgeeks.org/difference-between-stringbuffer-and-stringbuilder-in-java/

public class Test9 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));

        StringBuilder sb3 = new StringBuilder("abc");
        StringBuilder sb4 = sb3;
        sb4.append("d");
        System.out.println(sb3 + " " + sb4 + " " + (sb3 == sb4));
    }
}