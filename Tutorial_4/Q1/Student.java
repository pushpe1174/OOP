package Tutorial_4.Q1;

public class Student implements Printable{
    String name;
    String[] grade;
    @Override
    public void print() {
        System.out.println(name);
        for (String g: grade) {
            System.out.println(g);
        }
    }
}
