public class PercentageCouponDecorator extends CouponDecorator {
    Product product; 
    int discountPercentage;
    
    public PercentageCouponDecorator(Product product, int discountedPercentage) {
        super(product.getType(), product.getPrice());
        this.product = product;
        this.discountPercentage = discountedPercentage;
    }

    @Override
    public double getPrice() {
        return this.product.getPrice() * ((double)(100 - discountPercentage)/100.0);
    }
    
}
