package Library;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void deleteBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book deleted: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library.");
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; 
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Listing all books in the library:");
            for (Book book : books) {
                book.getInfo();
                System.out.println("------------------------");
            }
        }
    }
}
