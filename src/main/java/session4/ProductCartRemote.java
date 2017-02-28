package session4;

import java.util.List;

import javax.ejb.Remote;

import session4.vo.ProductVO;

@Remote
public interface ProductCartRemote {
	void addProduct(ProductVO productVO);
	List<ProductVO> getProductVOs();
	
}
