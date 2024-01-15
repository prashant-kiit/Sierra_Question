package Lesson6;

import java.util.regex.*;

public class Test14 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);

        Matcher m = p.matcher(args[1]);
        int count = 0;
        while (m.find())
            count++;
        System.out.print(count);
    }
}