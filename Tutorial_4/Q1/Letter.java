package Tutorial_4.Q1;

public class Letter implements Printable{
    String text;
    @Override
    public void print() {
        System.out.println(text);
    }
}
