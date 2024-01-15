package Lesson6;

import java.io.*;

public class Test11 {
    public static void main(String[] args) {
        Console c = System.console();
        String u = c.readLine("%s", "username: ");
        System.out.println("hello " + u);
        // String pw;
        char[] pw;
        if (c != null && (pw = c.readPassword("%s", "password: ")) != null) {
            System.out.println(u + "-" + pw[0] + pw[1] + pw[2]);
        }
    }
}