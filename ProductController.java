package ecommerce;

public class ProductController {
	
	private int productId;
	private int quantityOfProducts;
	private String productCategory;
	
	public ProductController() {
		this.productId = 0;
		quantityOfProducts = 0;
		productCategory = "  ";
	}
	public ProductController(int productId, int quantityOfProducts, String productCategory) {
		this.productId = productId;
		this.quantityOfProducts = quantityOfProducts;
		this.productCategory = productCategory;
	}	

	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantityOfProducts() {
		return quantityOfProducts;
	}

	public void setQuantityOfProducts(int quantityOfProducts) {
		this.quantityOfProducts = quantityOfProducts;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String toString() {
		return "ProductController [productId=" + productId + ", quantityOfProducts=" + quantityOfProducts
				+ ", productCategory=" + productCategory + "]";
	}	
	
}
