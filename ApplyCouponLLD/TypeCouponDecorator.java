import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator {
    Product product; 
    int discountPercentage;
    static List<ProductType> eligibleType = new ArrayList<>();
    static {
        eligibleType.add(ProductType.ELECTRONICS);
        eligibleType.add(ProductType.FOOD);
    }

    public TypeCouponDecorator(Product product, int discountedPercentage) {
        super(product.getType(), product.getPrice());
        this.product = product;
        this.discountPercentage = discountedPercentage;
    }

    @Override
    public double getPrice() {
        if(eligibleType.contains(this.product.getType())) {
            return this.product.getPrice() * ((double)(100 - discountPercentage)/100.0);
        }

        return this.product.getPrice();
    }
    
}
