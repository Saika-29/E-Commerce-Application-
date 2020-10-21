package ecommerce;

public class Item {
	
	private int itemId;
	private String itemName;
	private int itemQuantity;
	private String categoryOfItem;
	
	public Item() {
		this.itemId = 0;
		this.itemName = "  ";
		this.itemQuantity = 0;
		this.categoryOfItem = "  ";
	}
	
	public Item(int itemId, String itemName, int itemQuantity, String categoryOfItem) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.categoryOfItem = categoryOfItem;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getCategoryOfItem() {
		return categoryOfItem;
	}

	public void setCategoryOfItem(String categoryOfItem) {
		this.categoryOfItem = categoryOfItem;
	}

	
	public String showItemDetails() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity
				+ ", categoryOfItem=" + categoryOfItem + "]";
	}

}
