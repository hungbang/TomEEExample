package session4.vo;

import java.io.Serializable;

public class ProductVO implements Serializable{
	private String id;
	private String type;
	
	public ProductVO(){}
	public ProductVO(String id, String type) {
		this.id = id;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "ID: "+ id + " TYPE: "+ type;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof ProductVO)){
			return false;
		}
		ProductVO productVO = (ProductVO)obj;
		if(productVO.getId().equalsIgnoreCase(id) && productVO.getType().equalsIgnoreCase(type)){
			return true;
		}
		return false;
	}
}
