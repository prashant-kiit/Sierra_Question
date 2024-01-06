package Lesson1;
class Player {
    static int num;
}

public class Test3 {
    static Player player = new Player();
    public static void main(String[] args) {
        System.out.println(Player.num);
        //System.out.println(player.num); // warning: static ka chakar
    }
}
