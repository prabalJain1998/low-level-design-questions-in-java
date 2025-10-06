import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> products;
    int totalCartValue;


    Cart() {
        this.products = new ArrayList<>();
        this.totalCartValue = 0; 
    }

    public void addProductToCart(Product product) {
        this.products.add(product);

        int discountedCartValue = 0;
        for(int i=0;i<this.products.size();i++) {
            discountedCartValue += this.products.get(i).getPrice();
        }
        this.totalCartValue = discountedCartValue;
    }

    public int getTotalCartValue() {
        return this.totalCartValue;
    }
}
