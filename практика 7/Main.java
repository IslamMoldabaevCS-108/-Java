import java.util.*;

record MenuItem(String name, double price, String category) {
    @Override
    public String toString() {
        return name + " - " + price + " тг";
    }
}
class Order {
    private static int orderCount = 0;
    private final int orderId;
    private final List<MenuItem> items;
    public Order() {
        this.orderId = ++orderCount;
        this.items = new ArrayList<>();
    }
    public final int getOrderId() {
        return orderId;
    }
    public final List<MenuItem> getItems() {
        return items;
    }
    public final void addItem(MenuItem item) {
        items.add(item);
    }
    public final double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.price();
        }
        return total;
    }
    @Override
    public final String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", items=" + items +
                '}';
    }
}
class Customer {
    private final List<Order> orderHistory;
    public Customer(String ignoredName, String ignoredPhone) {
        this.orderHistory = new ArrayList<>();
    }
    public final void addOrder(Order order) {
        orderHistory.add(order);
    }
    @Override
    public final String toString() {
        return "Customer{" +
                "orderHistory=" + orderHistory +
                '}';
    }
}
interface ICafe {
    void addMenuItem(MenuItem item);

    List<MenuItem> getMenuItems();
    Order createOrder(Customer customer, List<MenuItem> items);
}
class Cafe implements ICafe {
    private final List<MenuItem> menuItems;
    private final Map<Integer, Customer> customers;
    private int customerIdCounter;
    public Cafe() {
        menuItems = new ArrayList<>();
        customers = new HashMap<>();
        customerIdCounter = 1;
    }
    @Override
    public final void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
    @Override
    public final List<MenuItem> getMenuItems() {
        return menuItems;
    }
    @Override
    public final Order createOrder(Customer customer, List<MenuItem> items) {
        Order order = new Order();
        for (MenuItem item : items) {
            order.addItem(item);
        }
        customer.addOrder(order);
        return order;
    }
    public final void addCustomer(Customer customer) {
        customers.put(customerIdCounter++, customer);
    }
    @Override
    public final String toString() {
        return "Cafe{" +
                "menuItems=" + menuItems +
                ", customers=" + customers +
                ", customerIdCounter=" + customerIdCounter +
                '}';
    }
}

