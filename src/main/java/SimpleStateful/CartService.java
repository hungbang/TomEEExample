package SimpleStateful;

import model.Product;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateful;
import java.util.List;

/**
 * Created by HungBang on 2/20/2017.
 */
@Local
public interface CartService {
   List<Product> getProList();
}
