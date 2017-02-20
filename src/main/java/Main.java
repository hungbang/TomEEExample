import SimpleStateful.Cart;
import SimpleStateful.CartService;
import SimpleStateful.Counter;
import model.Product;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Context context = EJBContainer.createEJBContainer().getContext();
            CartService cartService = (CartService)context.lookup("java:global/EJDContainerExample/CartServiceImpl");
            Cart cart = (Cart)context.lookup("java:global/EJDContainerExample/CartImpl");
            Counter counterA = (Counter) context.lookup("java:global/EJDContainerExample/Counter");
            List<Product> products = cartService.getProList();
            System.out.println("===print result===="+ products.size());

            products.forEach(p1 ->{
                System.out.println("===print result====");
                System.out.println(p1.getType());
            });
            Product p = new Product(4, "Yamaha");
            cart.addProductToCart(p);
            cart.checkOut();


        } catch (NamingException e) {
            e.printStackTrace();
        }

    }
}
