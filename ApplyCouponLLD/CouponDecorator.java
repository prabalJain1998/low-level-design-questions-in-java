public abstract class CouponDecorator extends Product {

    CouponDecorator(ProductType type, double price) {
        super(type, price);
    }

    public abstract double getPrice();
}
