package Lesson3;

// https://stackoverflow.com/questions/18996701/static-block-and-a-normal-block#:~:text=Normal%20block%20will%20be%20run,it%20in%20the%20static%20block.

class Test6 extends Raptor {
    public static void main(String[] args) {
        System.out.print("pre ");
        new Test6();
        System.out.println("hawk ");
    }
}

class Bird {
    static {
        System.out.print("b3 ");
    }

    {
        System.out.print("b1 ");
    }

    public Bird() {
        System.out.print("b2 ");
    }
}

class Raptor extends Bird {
    static {
        System.out.print("r1 ");
    }

    static {
        System.out.print("r4 ");
    }

    {
        System.out.print("r3 ");
    }

    public Raptor() {
        System.out.print("r2 ");
    }
}
