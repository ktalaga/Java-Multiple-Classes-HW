import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<Book>();
    }

    public int getBooksBorrowed(){
        return booksBorrowed.size();
    }

}
