import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> booksBorrowed;

    public Borrower(){
        this.booksBorrowed = new ArrayList<Book>();
    }

    public int getBooksBorrowed(){
        return booksBorrowed.size();
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.removeBookFromLibrary();
        this.booksBorrowed.add(book);
    }

}
