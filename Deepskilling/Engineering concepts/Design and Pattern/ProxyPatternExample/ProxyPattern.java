interface image{
    void display();
}
class RealImage implements image{
    private final String filename;
    public RealImage(String filename){
        this.filename=filename;
        loadremoteimage();
    }
    private void loadremoteimage(){
        System.out.println("image from the remote :"+filename);
    }
    public void display() {
        System.out.println("Dispalying Image "+filename);
    }
}
class proxyimage implements image{
    private final String filename;
    private RealImage realImage;

    public proxyimage(String filename) {
        this.filename = filename;
    }
    public void display() {
        if(realImage==null){
            realImage=new RealImage(filename);
        }else{
            System.out.println("Using the catched image "+filename);
        }
        realImage.display();
    }
}
public class ProxyPattern{
    public static void main (String[] args){
        image img1=new proxyimage("dog.jpg");
        image img2=new proxyimage("cat.jpg");
        System.out.println("......dog......");
        img1.display();
        System.out.println("......dog again......");
        img1.display();
        System.out.println("......cat......");
        img2.display();
    }
}