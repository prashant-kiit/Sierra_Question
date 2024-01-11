package Lesson3;

class Alien {
    String invade(int ships) {
        return "a few";
    }

    String invade(int... ships) {
        return "many";
    }

    String attack(short ships) {
        return "a few";
    }

    String attack(short... ships) {
        return "many";
    }
}

class Defender {
    static void foo(short n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        short n = 7;
        System.out.println(n);
        foo((short) 7);
        System.out.println(new Alien().invade(7));
        System.out.println(new Alien().invade(7, 8));
        System.out.println(new Alien().attack((short) 7));
        System.out.println(new Alien().attack((short) 7, (short) 8));
    }
}