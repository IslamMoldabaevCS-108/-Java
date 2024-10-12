class ElectronicDevice {

    private final String brand;
    private final String model;
    private final double price;
    public ElectronicDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + price + " руб.");
    }
}
class Smartphone extends ElectronicDevice {
    private final String operatingSystem;


    public Smartphone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Операционная система: " + operatingSystem);
        System.out.println("------------------------");
    }
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice("Samsung", "Galaxy Tab", 30000);
        System.out.println("Информация о электронном устройстве:");
        device.displayInfo();
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 90000, "iOS");
        System.out.println("Информация о смартфоне:");
        smartphone.displayInfo();
    }
}
