import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();
        this.booksByGenre = new HashMap<String, Integer>();

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

    public Book removeBookFromLibrary(){
        return this.bookCollection.remove(0);
    }

//    public int countBooksByGenre(String genre) {
//
//        this.bookCollection.forEach(book -> {
//            if(this.booksByGenre.containsKey(genre)){
//                booksByGenre();
//
//            }
//        });
//    }
}
