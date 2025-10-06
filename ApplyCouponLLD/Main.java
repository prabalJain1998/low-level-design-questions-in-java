class Main {
    public static void main(String[] args) {
        // Create some Products
        Product iphone11 = new Product(ProductType.ELECTRONICS, 1000);
        Product iphone12 = new Product(ProductType.ELECTRONICS, 1200);
        Product vegBurger = new Product(ProductType.FOOD, 100);
        // Product woodenTable = new Product(ProductType.FURNITURE, 500);
        // Product officeChair = new Product(ProductType.FURNITURE, 700);

        Cart shoppingCart = new Cart();
        Cart shoppingCartWithoutCoupon = new Cart();

        CouponDecorator iphone11TenPercentCoupon = new TypeCouponDecorator(iphone11, 10);
        CouponDecorator iphone12TwoPercentCoupon = new TypeCouponDecorator(iphone12, 2);
        CouponDecorator burgerTwentyPercentCoupon = new TypeCouponDecorator(vegBurger, 20);
     
        shoppingCartWithoutCoupon.addProductToCart(iphone11);
        shoppingCartWithoutCoupon.addProductToCart(iphone12);
        shoppingCartWithoutCoupon.addProductToCart(vegBurger);
        System.out.println("Shopping cart value without coupon "+shoppingCartWithoutCoupon.getTotalCartValue());

        shoppingCart.addProductToCart(iphone11TenPercentCoupon);
        shoppingCart.addProductToCart(iphone12TwoPercentCoupon);
        shoppingCart.addProductToCart(burgerTwentyPercentCoupon);

        System.out.println("Shopping cart value after applying coupon "+shoppingCart.getTotalCartValue());

    }
}