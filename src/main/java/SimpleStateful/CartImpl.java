package SimpleStateful;

import model.Product;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HungBang on 2/17/2017.
 */
@Stateful
public class CartImpl implements Cart {


    @PersistenceContext(unitName = "sakila-unit")
    private EntityManager entityManager;


    private List<Product> productList;

    @PostConstruct
    private void initialBean(){
        productList = new ArrayList<>();
    }

    @Override
    public void addProductToCart(Product product) {
        productList.add(product);
    }

    @Override
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void checkOut() {
        productList.forEach(p ->{
            entityManager.persist(p);
        });
        productList.clear();
    }
    @Override
    public List<Product> findAllProduct() {
        return entityManager.createQuery("select p from Product p", Product.class).getResultList();
    }
}
