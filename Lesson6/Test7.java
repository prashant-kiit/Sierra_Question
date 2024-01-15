package Lesson6;

import java.io.*;

class Test7 {
    static String[] dirs = { "./dir1", "dir2" };

    public static void main(String[] args) {
        for (String d : dirs) {
            String path = d;
            // System.out.println(File.separator);
            File file = new File(path, args[0]);
            System.out.print(file.exists() + " ");
        }
    }
}