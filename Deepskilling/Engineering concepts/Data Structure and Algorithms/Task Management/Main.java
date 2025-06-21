public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Design UI", "Pending"));
        manager.addTask(new Task(2, "Implement Backend", "In Progress"));
        manager.addTask(new Task(3, "Write Tests", "Pending"));

        manager.displayTasks();

        Task search = manager.searchTask(2);
        System.out.println("\nSearch Result: " + (search != null ? search : "Task not found"));

        manager.deleteTask(2);

        System.out.println("\nAfter Deletion:");
        manager.displayTasks();
    }
}
