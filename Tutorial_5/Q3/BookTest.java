package Tutorial_5.Q3;

class Book {
    private int pages; // number of pages in the book
    Book(int pages) {
        this.pages = pages;
    }
    public String toString() {
        return ""+pages; // convert pages to String before returning
    }
}
class Dictionary extends Book {
    private int words; // number of words in the dictionary
    Dictionary(int words, int pages) {
        super(pages);
// missing line 1 goes here - should call the parent constructor here
        this.words = words;
    }

    public String toString() {
        return super.toString() + " " + words; // convert pages to String before returning
    }



}
public class BookTest {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary(100000, 500);
        System.out.println(d1);
    }
}