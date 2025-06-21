public class Product {
    int productID;
    String productName;
    String category;
    public Product(int productID,String productName,String category){
        this.category=category;
        this.productID=productID;
        this.productName=productName;
    }
    public String toString(){
        return "ProductID : "+productID+" Productname : "+productName+" Category : "+category;
    }
}