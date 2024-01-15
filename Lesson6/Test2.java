package Lesson6;

// https://www.geeksforgeeks.org/serialization-in-java/
// Remember, constructors don't run on deserialized classes that implement Serializable

import java.io.*;


class CardPlayer extends Player implements Serializable {
    CardPlayer() {
        System.out.println("c");
    }
    
    public static void main(String[] args) {
        CardPlayer c1 = new CardPlayer();
        try {
            FileOutputStream fos = new FileOutputStream("play.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(c1);
            os.close();
            FileInputStream fis = new FileInputStream("play.txt");
            ObjectInputStream is = new ObjectInputStream(fis);
            CardPlayer c2 = (CardPlayer) is.readObject();
            System.out.println(c2);
            // https://stackoverflow.com/questions/8141440/how-are-constructors-called-during-serialization-and-deserialization
            is.close();
        } catch (Exception x) {
            System.out.println("Exception");
        }
    }
}

class Player {
    Player() {
        System.out.println("p");
    }
}