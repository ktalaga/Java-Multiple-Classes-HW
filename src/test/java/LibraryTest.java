import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book_1;
    private Book book_2;
    private Book book_3;

    @Before
    public void before(){
        library = new Library(3);
        book_1 = new Book("Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
        book_2 = new Book("Harry Potter", "J.K. Rowling", "Fantasy");
        book_3 = new Book("Python Crash Course", "Eric Matthes", "Thriller");
    }

    @Test
    public void shouldHaveCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book_1);
        library.addBookToLibrary(book_2);
        library.addBookToLibrary(book_3);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void canCheckIfCapacityIsFull(){
        library.addBookToLibrary(book_1);
//        library.addBookToLibrary(book_2);
        assertEquals(false, library.checkIfCapacityIsFull());
    }

//    @Test
//    public void shouldCountBooksByGenre(){
//        library.addBookToLibrary(book_1);
//        library.addBookToLibrary(book_2);
//        library.addBookToLibrary(book_3);
//        assertEquals(2,library.countBooksByGenre("Fantasy"));
//    }



}
