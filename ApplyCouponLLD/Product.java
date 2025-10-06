public class Product {
    ProductType type;
    private double price;

    Product(ProductType type, double price) {
        this.type = type;
        this.price = price;
    }

    public ProductType getType(){
        return this.type;
    }

    public double getPrice() {
        return this.price;
    } 
}
