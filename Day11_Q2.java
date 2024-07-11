// 5. Write a Java program to create a class called "Book" with attributes for title,
//  author, and ISBN, and methods to add and remove books from a collection. 
class Book{
    String title;
    String author;
    int ISBN;
    
    public void addBook(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void removeBook(){
        this.title = "";
        this.author = "";
        this.ISBN = 0;
    }
    public void printDetail(){
        System.out.println("Book title: "+this.title);
        System.out.println("Author name: "+this.author);
        System.out.println("ISBN : "+this.ISBN);
    }
}
public class Day11_Q2 {
   public static void main(String[] args) {
    Book book1 = new Book();
    Book book2 = new Book();

    book1.addBook("Java Programming", "John Doe", 1234567890);
    book2.addBook("Data Structures", "Jane Smith", 987654321);

    System.out.println("Details of Book 1:");
    book1.printDetail();

    System.out.println("\nDetails of Book 2:");
    book2.printDetail();

    book2.removeBook();

    System.out.println("\nAfter removing Book 2:");
    book2.printDetail();
   }
}
