public class Test {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics")
        };

        Product p1 = SearchFunction.LinearSearch(products, "Mouse");
        System.out.println("Linear Search : " + (p1 != null ? p1 : "not found"));

        SearchFunction.sortByName(products);

        Product p2 = SearchFunction.BinarySearch(products, "Mouse");
        System.out.println("Binary Search : " + (p2 != null ? p2 : "not found"));
    }
}
