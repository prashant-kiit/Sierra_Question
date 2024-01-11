package Lesson3;

public class Test8 {
    static int Test8 = 7;
    
    void go(int Test8) {
        Test8++;
        for (int Test8_ = 3; Test8_ < 6; Test8_++) {
            System.out.println(Test8);
            System.out.println(Test8_);
        }
        
        System.out.print(" " + Test8);
        // System.out.println(Test8_); // Error: Test8_ cannot be resolved to a variable
    }
    
    public static void main(String[] args) {
        new Test8().go(Test8);
        System.out.print(" " + Test8);
    }

}