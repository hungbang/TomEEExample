package SimpleStateful;

import model.Product;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

/**
 * Created by HungBang on 2/17/2017.
 */

@Local
public interface Cart {
    void addProductToCart(Product product);
    void checkOut();
    List<Product> findAllProduct();
}
