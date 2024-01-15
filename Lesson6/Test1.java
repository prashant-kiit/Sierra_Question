package Lesson6;

import java.util.regex.*;

class Test1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        boolean b = false;
        System.out.println(b);
        while (b = m.find()) {
            System.out.println(m.start() + "-" + m.group());
        }
    }
}