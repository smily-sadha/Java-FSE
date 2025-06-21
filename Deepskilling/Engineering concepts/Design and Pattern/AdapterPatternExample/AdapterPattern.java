interface Paymentmethod{
    void process(double amount);
}
class phonepay{
    public void phonepayMethod(double amount){
        System.out.println("Money received from the phonepay : "+amount);
    }
}
class googlepay{
    public void googlepayMethod(double amount){
        System.out.println("Money recieved from the gogglepay : "+amount);
    }
}
class paytm{
    public void paytmMethod(double amount){
        System.out.println("Money recieved from the paytm : "+amount);
    }
}
class phonepayAdapter implements Paymentmethod{
    private phonepay phpay = new phonepay();
    public void process(double amount){
        phpay.phonepayMethod(amount);
    }
}
class googlepayAdapter implements Paymentmethod{
    private googlepay gpay = new googlepay();
    public void process(double amount){
        gpay.googlepayMethod(amount);
    }
}
class paytmAdapter implements Paymentmethod{
    private paytm pay = new paytm();
    public void process(double amount){
        pay.paytmMethod(amount);
    }
}

public class AdapterPattern {
    public static void main(String[] args){
        Paymentmethod g1=new googlepayAdapter();
        Paymentmethod ph1=new phonepayAdapter();
        Paymentmethod p1=new paytmAdapter();

        g1.process(10000);
        ph1.process(50000);
        p1.process(100000);
    }
}