package Lesson3;

class Mixer {
    Mixer m1;

    Mixer() {
    }

    Mixer(Mixer m) {
        m1 = m;
    }

    void go() {
        System.out.print("hi ");
    }

    public static void main(String[] args) {
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
        Mixer m5 = m2.m1;
        System.out.println(m5);
        // m5.go(); //Error: Cannot invoke "Lesson3.Mixer.go()" because "m5" is null
    }
}