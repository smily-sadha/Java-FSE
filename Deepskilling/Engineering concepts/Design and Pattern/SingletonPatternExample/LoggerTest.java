public class LoggerTest {
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        l1.msg("This is my first message");
        l2.msg("This is my second message");

        if (l1 == l2) {
            System.out.println("Both are the same instance");
        } else {
            System.out.println("Different instance (Singleton failed)");
        }
    }
}
