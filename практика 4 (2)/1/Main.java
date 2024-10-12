import java.util.ArrayList;
import java.util.List;

class Book {
    private final String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true; // Книга доступна при создании
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void borrow() {
        isAvailable = false;
    }
    public void returnBook() {
        isAvailable = true;
    }
}
class Reader {
    private final String name;
    public Reader(String name) {
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            System.out.println(name + " взял книгу '" + book.getTitle() + "'");
        } else {
            System.out.println(name + " не может взять книгу '" + book.getTitle() + "' - она недоступна.");
        }
    }
    public void returnBook(Book book) {
        book.returnBook();
        System.out.println(name + " вернул книгу '" + book.getTitle() + "'");
    }
}
class Library {
    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984");
        Book book2 = new Book("Убить пересмешника");
        library.addBook(book1);
        library.addBook(book2);
        Reader reader1 = new Reader("Алексей");
        Reader reader2 = new Reader("Мария");
        library.listAvailableBooks();
        reader1.borrowBook(book1);
        reader2.borrowBook(book1);
        library.listAvailableBooks();
        reader1.returnBook(book1);
        library.listAvailableBooks();
    }
}
