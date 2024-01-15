package Lesson7;

// https://www.youtube.com/watch?v=K1iu1kXkVoA

interface Hungry<E> {
    void munch(E x);
}

abstract class Plant {
}

interface Herbivore<E extends Animal> extends Hungry<E> {
}

abstract class Animal {
}

interface Carnivore<E extends Animal> extends Hungry<E> {
}

class Grass extends Plant {
}


class Sheep extends Animal implements Herbivore<Sheep> {
    public void munch(Sheep x) {
    }
}

class Wolf extends Animal implements Carnivore<Sheep> {
    public void munch(Sheep x) {
    }
}