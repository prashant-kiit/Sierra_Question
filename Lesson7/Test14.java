package Lesson7;

import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        ArrayList<Hotel> a = new Test14().go();
        System.out.println(a);
    }
    ArrayList<Hotel> go() {
        return new ArrayList<Hotel>();
    }    
}


class Business {
}

class Hotel extends Business {
}

class Inn extends Hotel {
}
