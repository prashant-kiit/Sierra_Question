package Lesson5;

public class Test10 {
    public static void main(String[] args) {
        int[] ia = { 1, 3, 5, 7, 9 };
        for (int x : ia) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8)
                    continue;
                System.out.print(" " + x); // 1 1 3 3 9 9
                if (j == 1)
                    break;
                continue;
            }
            continue;
        }
    }
}