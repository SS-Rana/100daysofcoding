package Library;

public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();

        Book book1 = new Book("Java Programming", 12345, "John Doe");
        Book book2 = new Book("Python for Beginners", 54321, "Jane Smith");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("\nDisplaying all books in the library:");
        library.displayAllBooks();

        System.out.println("\nBorrowing 'Java Programming':");
        Book foundBook = library.findBookByTitle("Java Programming");
        if (foundBook != null) {
            foundBook.borrow();
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nDisplaying all books after borrowing:");
        library.displayAllBooks();

        
        System.out.println("\nReturning 'Java Programming':");
        if (foundBook != null) {
            foundBook.returnBook();
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\nDisplaying all books after returning:");
        library.displayAllBooks();
        
        System.out.println("\nDeleting 'Python for Beginners':");
        library.deleteBook(book2);

        System.out.println("\nDisplaying all books after deleting:");
        library.displayAllBooks();
    }
}
