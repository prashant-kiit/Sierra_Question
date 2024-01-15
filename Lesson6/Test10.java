package Lesson6;

import java.io.*;

public class Test10 {
    public static void main(String[] args) {
        String s;
        try {
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((s = br.readLine()) != null)
                System.out.println(s);
            // br.flush(); // You can call flush() only when you're writing data. Readers don't have flush() methods
            br.close();
        } catch (IOException e) {
            System.out.println("io error");
        }
    }
}