package Lesson7;

import java.util.*;

class MapEQ {
    public static void main(String[] args) {
        Map<ToDos, String> m = new HashMap<ToDos, String>();
        // Map<String, String> m = new HashMap<String, String>();
        ToDos t1 = new ToDos("Monday");
        ToDos t2 = new ToDos("Monday");
        ToDos t3 = new ToDos("Tuesday");
        m.put(t1, "doLaundry");
        m.put(t2, "payBills");
        m.put(t3, "cleanAttic");
        // m.put("A", "doLaundry");
        // m.put("A", "payBills");
        // m.put("B", "cleanAttic");
        System.out.println(m.size());
    }
}

class ToDos {
    String day;

    ToDos(String d) {
        this.day = d;
    }

    public boolean equals(Object o) {
        return ((ToDos) o).day == this.day;
    }
    
    public int hashCode() { return 9; }
}