package Lesson6;

import java.io.*;

class Vehicle {
    // Un-Serializable
}

class Wheels {
    // Un-Serializable
}

class Car extends Vehicle implements Serializable {
    // Serializable
}

class Ford extends Car {
    // Serializable
}

class Dodge extends Car {
    // Un-Serializable b.c of Un-Serializable Wheels
    Wheels w = new Wheels();
}