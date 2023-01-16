package basic05_collection;

public class ProductVO<T> {
	private T productName;
	public ProductVO() {
		
	}
	public T getProductName() {
		return productName;
	}
	public void setProductName(T productName) {
		this.productName = productName;
	}
	
}
