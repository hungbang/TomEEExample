package session4;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import SimpleStateful.Cart;

@Stateful
public class CommonBeanImpl implements CommonBean{

	@EJB
	private ProductCart productCart;
	
	@EJB
	private OtherBean otherBean;
	
	@EJB
	private Cart cart;
	
	@Override
	public ProductCart getProductCart() {
		return productCart;
	}

	@Override
	public OtherBean getOtherBean() {
		return otherBean;
	}

	@Override
	public Cart getCart() {
		// TODO Auto-generated method stub
		return cart;
	}

}
