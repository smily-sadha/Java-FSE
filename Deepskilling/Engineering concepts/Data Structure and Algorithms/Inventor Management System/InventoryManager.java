import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Added: " + product);
    }
    public void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
            System.out.println("Updated: " + p);
        } else {
            System.out.println("Product ID not found.");
        }
    }
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product removed = inventory.remove(productId);
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product ID not found.");
        }
    }

    // Display inventory
    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
