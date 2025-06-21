interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(1000);

        context.setStrategy(new PayPalPayment());
        context.executePayment(2500);
    }
}
