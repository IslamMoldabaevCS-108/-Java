import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CafeApp {
    public CafeApp() {
    }

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.addMenuItem(new MenuItem("Кофе", 950.0, "Напитки"));
        cafe.addMenuItem(new MenuItem("Сэндвич", 1900.0, "Еда"));
        cafe.addMenuItem(new MenuItem("Чизкейк", 1230.0, "Десерт"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в кафе!");
        System.out.print("Введите имя клиента: ");
        String name = scanner.nextLine();
        System.out.print("Введите телефон клиента: ");
        String phone = scanner.nextLine();
        Customer customer = new Customer(name, phone);
        cafe.addCustomer(customer);
        List<MenuItem> orderItems = new ArrayList<>();
        boolean ordering = true;
        while (ordering) {
            System.out.println("\nМеню:");
            for (MenuItem item : cafe.getMenuItems()) {
                System.out.println(item);
            }
            System.out.print("Введите название блюда для добавления в заказ (или 'готово' для завершения): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("готово")) {
                ordering = false;
            } else {
                for (MenuItem item : cafe.getMenuItems()) {
                    if (item.name().equalsIgnoreCase(itemName)) {
                        orderItems.add(item);
                        System.out.println(itemName + " добавлен в заказ.");
                        break;
                    }
                }
            }
        }

        
        
        Order order = cafe.createOrder(customer, orderItems);
        System.out.println("\nID заказа: " + order.getOrderId());
        System.out.println("Заказанные блюда:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item);
        }
        System.out.printf("Общая стоимость (тг): %.2f%n", order.getTotalPrice());
        scanner.close();
    }
}
