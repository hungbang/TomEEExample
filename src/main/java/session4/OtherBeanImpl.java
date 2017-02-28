package session4;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import session4.vo.ProductVO;

@Stateless
public class OtherBeanImpl implements OtherBean {

	@EJB
	private ProductCart productCart;
	
	@Override
	public void addProduct(ProductVO productVO) {
		productCart.addProduct(productVO);

	}

	@Override
	public List<ProductVO> getProductVOs() {
		return productCart.getProductVOs();
	}

}
