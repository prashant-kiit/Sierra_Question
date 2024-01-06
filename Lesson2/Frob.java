package Lesson2;

public class Frob implements Test1 {
    
    public void twiddle(Integer s) { }

    @Override
    public void twiddle(String s) {
        throw new UnsupportedOperationException("Unimplemented method 'twiddle'");
    }

}