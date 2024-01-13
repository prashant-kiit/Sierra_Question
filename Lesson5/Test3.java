package Lesson5;

class Test4 {
    public static void main(String[] args) throws Exception {
        try {
            int x = Integer.parseInt("two");
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}