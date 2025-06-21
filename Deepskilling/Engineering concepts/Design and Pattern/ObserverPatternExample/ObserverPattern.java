import java.util.*;

interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
    void setPrice(double price);
}
class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
interface Observer {
    void update(double price);
}
class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    public void update(double price) {
        System.out.println(appName + " - MobileApp: Stock price updated to ₹" + price);
    }
}

class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    public void update(double price) {
        System.out.println(appName + " - WebApp: Stock price updated to ₹" + price);
    }
}
public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile1 = new MobileApp("Client A");
        Observer mobile2 = new MobileApp("Client B");
        Observer web = new WebApp("Client C");

        market.register(mobile1);
        market.register(mobile2);
        market.register(web);

        System.out.println("Stock price changes to ₹1000");
        market.setPrice(1000);

        System.out.println("\nClient B unsubscribes...");
        market.deregister(mobile2);

        System.out.println("Stock price changes to ₹1200");
        market.setPrice(1200);
    }
}
