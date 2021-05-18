import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
    }

    @Test
    public void shouldHaveName(){
        assertEquals("Lord of the Rings", book.hasName());
    }

    @Test
    public void shouldHaveAuthor(){
        assertEquals("J.R.R. Tolkien", book.hasAuthor());
    }

    @Test
    public void shouldHaveGenre(){
        assertEquals("Fantasy", book.hasGenre());
    }

}
