public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(201, "Alice", 1500.0),
                new Order(202, "Bob", 800.0),
                new Order(203, "Charlie", 2300.0),
                new Order(204, "Diana", 1200.0)
        };

        System.out.println("Original Orders:");
        OrderSorter.displayOrders(orders);

        OrderSorter.bubbleSort(orders);
        System.out.println("\nOrders sorted by Bubble Sort (ascending totalPrice):");
        OrderSorter.displayOrders(orders);

        orders = new Order[] {
                new Order(201, "Alice", 1500.0),
                new Order(202, "Bob", 800.0),
                new Order(203, "Charlie", 2300.0),
                new Order(204, "Diana", 1200.0)
        };

        OrderSorter.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders sorted by Quick Sort (ascending totalPrice):");
        OrderSorter.displayOrders(orders);
    }
}
