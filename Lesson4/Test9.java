package Lesson4;

// https://www.geeksforgeeks.org/operators-in-c/

public class Test9 {
    public static void main(String[] args) {
        int mask = 0; // 2
        int count = 0;
        // if (((5 < 7) || (++count < 10)) | mask++ < 10) // true
        if (((5 > 7) || (++count < 10)) | mask++ < 10) 
            mask = mask + 1;
        // if ((6 > 8) ^ false) // false
        if ((6 > 8) ^ true) 
            mask = mask + 10;
        if (!(mask > 1) && ++count > 1) // false
            mask = mask + 100;
        System.out.println(mask + " " + count);
    }
}