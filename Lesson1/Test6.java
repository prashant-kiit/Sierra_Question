package Lesson1;
interface Device {
    public void doIt();
}

interface Dhiwise {
    void makeIt();
}

public class Test6 implements Device {
    public void doIt() {
    }
}

abstract class Phone1 extends Test6 {
}

abstract class Phone2 extends Test6 {
    public void doIt(int x) {
    }
}

class Phone3 extends Test6 implements Dhiwise {
    public void doStuff() {
    }

@Override
public void makeIt() {
        throw new UnsupportedOperationException("Unimplemented method 'makeIt'");
    }
}
