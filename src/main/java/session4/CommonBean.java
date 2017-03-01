package session4;

import javax.ejb.Remote;

import SimpleStateful.Cart;

@Remote
public interface CommonBean {
	public ProductCart getProductCart();
	public OtherBean getOtherBean();
	public Cart getCart();
}
