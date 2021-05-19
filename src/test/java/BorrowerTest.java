import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower();
    }

    @Test
    public void shouldCountBooksBorrowed(){
        assertEquals(0, borrower.getBooksBorrowed());
    }

}
