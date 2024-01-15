package Lesson6;

import java.text.*;

public class Test13 {
    public static void main(String[] args) {
        String s = "987.123456";
        double d = 987.123456d;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(d) + " ");
        try {
            System.out.println(nf.parse(s)); // Important
        } catch (Exception e) {
            System.out.println("got exc");
        }
    }
}