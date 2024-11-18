public class Book {
    static int totalBook;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBook = 0;
    }

    {
        totalBook++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknowned", "Unknowned");
    }

    static int getTotalBook() {
        return totalBook;
    }
    
    void borrowBook() {
        if(isBorrowed) {
            System.out.println("Book named " + title + " is already Borrowed!");
        } else {
            System.out.println("Enjoy The Book Named "+ title + "...");
            this.isBorrowed = true;
        }
    }

    void returnBook() {
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope You Have Enjoyed The Book Named " + title + "! Thank You.");
        } else {
            System.out.println(title + " Named Book is already on the library!");
        }
    }
    public static void main(String[] args) {
        Book DesignPattarn = new Book("1", "Design Pattarn", "Head First");
        Book EffectiveJava = new Book("2");
        System.out.println(Book.getTotalBook());
        DesignPattarn.borrowBook();
        EffectiveJava.borrowBook();
        DesignPattarn.borrowBook();
        DesignPattarn.returnBook();
        DesignPattarn.returnBook();
        EffectiveJava.returnBook();
    }
}
