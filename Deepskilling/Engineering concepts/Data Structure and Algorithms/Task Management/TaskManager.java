public class TaskManager {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.data.taskId == taskId) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void displayTasks() {
        TaskNode current = head;
        System.out.println("Task List:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) return;

        if (head.data.taskId == taskId) {
            head = head.next;
            return;
        }

        TaskNode current = head;
        while (current.next != null && current.next.data.taskId != taskId) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}
