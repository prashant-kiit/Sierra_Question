package Lesson6;

import java.io.*;

public class Test4 implements Serializable {
    private Keyboard k = new Keyboard();

    public static void main(String[] args) {
        Test4 c = new Test4();
        c.storeIt(c);
    }

    void storeIt(Test4 c) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("myFile"));
            os.writeObject(c);
            os.close();
            System.out.println("done");
        } catch (Exception x) {
            System.out.println(x.toString());
        }
    }
}

class Keyboard implements Serializable{
}