class Product {

    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public void increaseQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Количество товара увеличено на " + amount + ". Новое количество: " + quantity);
        } else {
            System.out.println("Количество должно быть положительным!");
        }
    }
    public void decreaseQuantity(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println("Количество товара уменьшено на " + amount + ". Новое количество: " + quantity);
        } else {
            System.out.println("Невозможно уменьшить количество на " + amount + ". Проверьте вводимые данные.");
        }
    }
    public void changePrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
            System.out.println("Цена изменена на " + newPrice + ". Новая цена: " + price);
        } else {
            System.out.println("Цена не может быть отрицательной!");
        }
    }
    public void displayInfo() {
        System.out.println("Название продукта: " + name);
        System.out.println("Количество на складе: " + quantity);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("------------------------");
    }
    public static void main(String[] args) {

        Product product = new Product("Яблоки", 100, 50.0);
        product.displayInfo();
        product.increaseQuantity(50);
        product.decreaseQuantity(30);
        product.changePrice(45.0);
        product.displayInfo();
    }
}
