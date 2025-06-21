public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        manager.addEmployee(new Employee(1, "Alice", "Developer", 60000));
        manager.addEmployee(new Employee(2, "Bob", "Manager", 80000));
        manager.addEmployee(new Employee(3, "Charlie", "Analyst", 50000));

        manager.displayAll();

        Employee e = manager.searchEmployee(2);
        System.out.println("\nSearch Result: " + (e != null ? e : "Not Found"));

        manager.deleteEmployee(2);
        System.out.println("\nAfter Deletion:");
        manager.displayAll();
    }
}
