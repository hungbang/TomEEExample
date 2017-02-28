package session4;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class CommonBeanImpl implements CommonBean{

	@EJB
	private ProductCart productCart;
	
	@EJB
	private OtherBean otherBean;
	
	@Override
	public ProductCart getProductCart() {
		return productCart;
	}

	@Override
	public OtherBean getOtherBean() {
		return otherBean;
	}

}
