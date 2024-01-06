package Lesson1;
class Test1 {
    public static void main(String[] args) {
      doStuff(1);  
      //doStuff(1);  
    }
    static void doStuff(int y, int... x) {
        System.out.println("Check");
    }
}