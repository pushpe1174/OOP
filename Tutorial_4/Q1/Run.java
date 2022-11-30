package Tutorial_4.Q1;
public class Run {
    public static void main(String[] args){
        Letter l = new Letter();
        l.text = "Hello World;";

        Student s = new Student();
        s.name = "Ganindu";
        s.grade = new String[]{"A","B","A","B","C"};

        l.print();
        s.print();
    }
}
