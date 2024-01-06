package Lesson1;
class Hobbit {
    static int countGold(int x, int y) {
        return x + y;
    }
}

public class Test9 extends Hobbit {
    public static void main(String[] args) {
        Short myGold = 7;
        System.out.println(countGold(myGold, 6));
    }
}
