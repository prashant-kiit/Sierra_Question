package Lesson2;

class Dog {
    public void bark() {
        System.out.print("woof ");
    }
}

class Hound extends Dog {
    public void sniff() {
        System.out.print("sniff ");
    }

    @Override
    public void bark() {
        System.out.print("howl ");
    }
}

public class Test8 {
    public static void main(String[] args) {
        new Test8().go();
    }

    void go() {
        new Dog().bark();
        new Hound().bark();
        Dog g = new Hound();
        g.bark();
        ((Dog)g).bark();
        ((Hound)g).bark();
        ((Dog) new Hound()).bark(); // similar to : Dog g = new Hound();
        // ((Hound) new Dog()).bark(); // Error : class Lesson2.Dog cannot be cast to class Lesson2.Hound (Lesson2.Dog and Lesson2.Hound are in unnamed module of loader 'app')
        // g.sniff(); // Error: The method sniff() is undefined for the type Dog
        // ((Dog) new Hound()).sniff(); // Error: The method sniff() is undefined for the type Dog
    }
}