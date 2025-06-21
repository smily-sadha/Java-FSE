interface Notifier{
    void send(String msg);
}
class emailNotifier  implements Notifier{
    @java.lang.Override
    public void send(String msg) {
        System.out.println("mail : "+msg);
    }
}
abstract class NotifierDecorator implements Notifier{
    protected Notifier notifier;
    public NotifierDecorator(Notifier notifier){
        this.notifier=notifier;
    }
    public void send(String msg) {
        notifier.send(msg);
    }
}
class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    public void send(String msg) {
        super.send(msg);
        System.out.println("SMS : "+msg);
    }
}
class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }
    public void send(String msg){
        super.send(msg);
        System.out.println("Slack : "+msg);
    }
}
public class DecoratorPattern {
    public static void main(String[] args){
        Notifier notifier=new emailNotifier();
        notifier = new SlackNotifierDecorator(notifier);
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send("your shippment is out for delivery");
        }
    }
