import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void shouldHaveCapacity(){
        assertEquals(100, library.getCapacity());
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book);
        assertEquals(1, library.countBooks());
    }

}
