package Interview;

interface Greet {
    void say();    
}

class Hello implements Greet {
    @Override
    public void say() {
        System.out.println("Hello");
    }
}

@FunctionalInterface
interface Designation {
    void work();    
}

class Manager implements Designation {
    @Override
    public void work() {
        System.out.println("Manage everyone");
    }
}

@FunctionalInterface
interface City {
    void cheer();    
    //void roar(int n);    
}

public class Demo {
    public static void main(String[] args) {
        Greet greet1 = new Hello();
        greet1.say();

        Greet greet2 = new Greet() {
            public void say() {
                System.out.println("Anonymous hello");
            }
        };
        greet2.say();

        Designation designation1 = new Manager();
        designation1.work();
     
        Designation designation2 = new Designation() {
            @Override
            public void work() {
                System.out.println("Anonymously manage everyone");
            }  
        };
        designation2.work();

        City city = () -> { System.out.println("This is my city"); };
        city.cheer();
    }
}
