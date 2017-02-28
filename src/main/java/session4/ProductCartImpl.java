package session4;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

import session4.vo.ProductVO;

@Stateful
public class ProductCartImpl implements ProductCart, ProductCartRemote{
	private List<ProductVO> prods = new ArrayList<ProductVO>();
	@Override
	public void addProduct(ProductVO p) {
			prods.add(p);
	}

	@Override
	public List<ProductVO> getProductVOs() {
		return prods;
	}
	
	@PrePassivate
	public void passivate(){
		System.out.println("===This is @PrePassivate state====");
	}
	
	@PostActivate
	public void activated(){
		System.out.println("===This is @PostActivate state====");
	}
	@PostConstruct
	public void postContruct(){
		System.out.println("===This is @PostConstruct state====");
	}
	@PreDestroy
	public void detroy(){
		System.out.println("===This is @PreDestroy state====");
	}
}
