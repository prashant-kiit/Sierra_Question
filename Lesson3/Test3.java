package Lesson3;

class Dims {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, }, { 3, 4 } };
        System.out.println(a[0][1]);
        int[] b = (int[]) a[1];
        System.out.println(b[0]);
        int[] c = a[1];
        System.out.println(c[0]);
        Object o1 = a;
        System.out.println(o1);
        int[][] a2 = (int[][]) o1;
        System.out.println(a2);
        // int[] b2 = (int[]) o1; // Error: such casting not possible
        // System.out.println(b2[1]);
    }
}