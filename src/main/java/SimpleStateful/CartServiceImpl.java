package SimpleStateful;

import model.Product;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import java.util.List;

/**
 * Created by HungBang on 2/20/2017.
 */
@Stateful
public class CartServiceImpl implements CartService{

    @EJB
    private Cart cart;

    @Override
    public List<Product> getProList() {
        return cart.findAllProduct();
    }
}
