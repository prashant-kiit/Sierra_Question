package Lesson3;

public class Test7 {
    public enum Suits {
        CLUBS(20), DIAMONDS(20), HEARTS(30), SPADES(30),
        NOTRUMP(400) {
            public int getValue(int bid) {
                return ((bid - 1) * 30) + 40;
            }
        };

        private int points;

        Suits(int points) {
            this.points = points;
        }

        public int getValue(int bid) {
            return points * bid;
        }
    }

    public static void main(String[] args) {
        System.out.println(Suits.values()[0]);
        System.out.println(Suits.values()[1]);
        System.out.println(Suits.values()[2]);
        System.out.println(Suits.values()[3]);
        System.out.println(Suits.values()[4]);
        System.out.println(Suits.SPADES + " " + Suits.SPADES.points);
        System.out.println(Suits.SPADES + " " + Suits.SPADES.getValue(15));
        System.out.println(Suits.DIAMONDS + " " + Suits.DIAMONDS.points);
        System.out.println(Suits.DIAMONDS + " " + Suits.DIAMONDS.getValue(15));
        System.out.println(Suits.NOTRUMP + " " + Suits.NOTRUMP.points);
        System.out.println(Suits.NOTRUMP + " " + Suits.NOTRUMP.getValue(1));
    }
}