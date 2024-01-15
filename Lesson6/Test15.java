package Lesson6;

import java.util.*;

public class Test15 {
    public static void main(String[] args) {
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        // Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("check");
            x = sc.nextInt(); // The nextXxx() methods are typically invoked after a call to a hasNextXxx(), which determines whether the next token is of the correct type.
            System.out.print(x + "-");
        } while (x != 0);
        sc.close();
    }
}