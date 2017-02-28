package session4;

import javax.ejb.Remote;

@Remote
public interface CommonBean {
	public ProductCart getProductCart();
	public OtherBean getOtherBean();
}
