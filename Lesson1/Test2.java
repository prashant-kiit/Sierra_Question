package Lesson1;
enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");

    String sound;

    Animals(String s) {
        sound = s;
    }
}

enum Salutation {
    Hello, Namaste, Salaam;
}

class Test2 {
    
    static Animals animals;
    public static void main(String[] args) {
        Animals[] a = Animals.values();
        System.out.println(a[2]);
        System.out.println(a[2].ordinal());
        System.out.println(a[2].sound);
        System.out.println(Animals.CAT);
        System.out.println(Animals.CAT.ordinal());
        System.out.println(Animals.CAT.sound);
        System.out.println(Salutation.Hello);
        System.out.println(Salutation.Hello.ordinal());
        //System.out.println(animals.CAT.sound); // warning: static ka chakar
    }

}
