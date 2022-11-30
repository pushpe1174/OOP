package Tutorial_2.Q2;

public class Q2 {
    public static void main(String[] args){
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog ";
        String article = "the ";
        String action = "jumps over ";

        System.out.println(article.concat(animal1).concat(action).concat(animal2));

        System.out.println(article + animal1 + action + animal2);
    }
}
