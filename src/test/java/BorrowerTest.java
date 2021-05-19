import com.sun.org.apache.bcel.internal.generic.LUSHR;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(10);
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        library.addBookToLibrary(book);
    }

    @Test
    public void shouldCountBooksBorrowed(){
        assertEquals(0, borrower.getBooksBorrowed());
    }

    @Test
    public void shouldBorrowBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.getBooksBorrowed());

    }

}
