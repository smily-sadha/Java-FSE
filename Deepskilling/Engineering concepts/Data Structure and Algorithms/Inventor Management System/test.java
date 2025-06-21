public class test {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 10, 55000));
        manager.addProduct(new Product(102, "Mouse", 150, 400));
        manager.addProduct(new Product(103, "Keyboard", 100, 800));

        manager.updateProduct(102, 120, 450);
        manager.deleteProduct(101);
        manager.displayInventory();
    }
}
