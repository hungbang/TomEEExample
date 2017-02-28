package session4;

import java.util.List;

import javax.ejb.Local;

import session4.vo.ProductVO;

@Local
public interface OtherBean {
	void addProduct(ProductVO productVO);
	List<ProductVO> getProductVOs();
}
