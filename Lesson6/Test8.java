package Lesson6;

import java.io.*;

public class Test8 {
    public static void main(String[] args) {
        SpecialSerial s = new SpecialSerial();
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("myFile"));
            os.writeObject(s);
            os.close();
            System.out.println(++SpecialSerial.z + " " + s.y);

            ObjectInputStream is = new ObjectInputStream(
                    new FileInputStream("myFile"));
            SpecialSerial s2 = (SpecialSerial) is.readObject();
            is.close();
            System.out.println(s2.y + " " + SpecialSerial.z);
        } catch (Exception x) {
            System.out.println("exc");
        }
    }
}

class SpecialSerial implements Serializable {
    transient int y = 7;
    static int z = 9;
}