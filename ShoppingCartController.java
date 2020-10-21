package ecommerce;

public class ShoppingCartController {

	private int pId;
	private String pName;
	private String pDescription;
	private int pQuantity;
	private double pUnitPrice;
	
	public ShoppingCartController() {
		this.pId = 0;
		this.pName = "  ";
		this.pDescription = "  ";
		this.pQuantity = 0;
		this.pUnitPrice = 0.0;
	}
	 public ShoppingCartController(int pId, String pName, String pDescription, int pQuantity, double pUnitPrice) {
		this.pId = pId;
		this.pName = pName;
		this.pDescription = pDescription;
		this.pQuantity = pQuantity;
		this.pUnitPrice = pUnitPrice;
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDescription() {
		return pDescription;
	}
	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	public double getpUnitPrice() {
		return pUnitPrice;
	}
	public void setpUnitPrice(double pUnitPrice) {
		this.pUnitPrice = pUnitPrice;
	}
	
	public void addToCart() {
	
	}
	public void removeFromCart() {
		
	}
	public void confirmCart() {
		
	}
	public String getCartDetails() {
		return "ShoppingCart [pId=" + pId + ", pName=" + pName + ", pDescription=" + pDescription + ", pQuantity="
				+ pQuantity + ", pUnitPrice=" + pUnitPrice + "]";
	}

}
