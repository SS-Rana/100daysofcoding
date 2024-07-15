package Library;

public class Book {
    private String title;
    private int serialNo;
    private String authorName;
    private boolean borrowed;

    public Book(String title, int serialNo, String authorName) {
        this.title = title;
        this.serialNo = serialNo;
        this.authorName = authorName;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void borrow() {
        if (borrowed) {
            System.out.println("The book '" + title + "' is currently not available for borrowing.");
        } else {
            borrowed = true;
            System.out.println("You have borrowed the book '" + title + "'.");
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("You have returned the book '" + title + "'.");
        } else {
            System.out.println("The book '" + title + "' was not borrowed.");
        }
    }

    public void getInfo() {
        System.out.println("Name of book: " + title);
        System.out.println("Serial No: " + serialNo);
        System.out.println("Author: " + authorName);
        System.out.println("Borrowed: " + (borrowed ? "Yes" : "No"));
    }
}
