package SimpleStateful;

import model.Product;

import java.util.List;

/**
 * Created by HungBang on 2/17/2017.
 */

public interface Cart {
    void addProductToCart(Product product);
    void checkOut();
    List<Product> findAllProduct();
}
