package Lesson4;

// https://www.geeksforgeeks.org/equality-operator-in-java-with-examples/

class Comp2 {
    public static void main(String[] args) {
        float f1 = 2.3f;
        float[][] f2 = { { 42.0f }, { 1.7f, 2.3f }, { 2.6f, 2.7f } };
        float[] f3 = { 2.7f };
        Long x = 42L;
        // if(f1 == f2) // Error: Incompatible operand types float and float[][]
        //     System.out.println("true1");
        if(f1 == f2[2][1])
            System.out.println("true2");
        if(x == f2[0][0])
            System.out.println("true3");
        // if(f1 == f2[1,1]) // Error : Syntax error on token ",", invalid AssignmentOperator
        //     System.out.println("true4");
        if(f3 == f2[2])
            System.out.println("true5");
    }
}