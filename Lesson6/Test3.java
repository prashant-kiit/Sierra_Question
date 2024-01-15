package Lesson6;

// https://www.geeksforgeeks.org/wrapper-classes-java/
// https://ioflood.com/blog/dot-equals-method-java/#:~:text=equals()%20method%20is%20primarily,any%20two%20objects%20in%20Java.

class TKO {
    public static void main(String[] args) {
        String s = "-"; // -.e1.e2=sfly
        Long x = 343L;
        Integer L343 = 343;
        System.err.println(x);
        System.out.println(L343);
        if (x.equals(L343)) // Remember, that the equals() method for the integer wrappers will only return true if the two primitive types and the two values are equal.
            s += ".e1 ";
        if (x.equals(343L))
            s += ".e2 ";
        Short s1 = (short) ((new Short((short) 343)) / (new Short((short) 49)));
        if (s1 == 7)
            s += "=s ";
        if (s1 < new Integer(7 + 1))
            s += "fly ";
        System.out.println(s);
    }
}