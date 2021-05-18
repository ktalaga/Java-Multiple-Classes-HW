import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countBooks() {
        return this.bookCollection.size();
    }

    public void addBookToLibrary(Book book) {
        if(checkIfCapacityIsFull() == false){
            this.bookCollection.add(book);
        }

    }

    public boolean checkIfCapacityIsFull() {
        if(this.countBooks() < this.capacity){
            return false;
        } return true;
    }
}
