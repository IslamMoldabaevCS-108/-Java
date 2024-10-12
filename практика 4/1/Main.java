class Book {

    private final String title;
    private final String author;
    private final double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Название книги: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "Джордж Оруэлл", 500);
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков", 700);
        Book book3 = new Book("Преступление и наказание", "Федор Достоевский", 600);
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
