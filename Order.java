package ecommerce;

public class Order {

	private int orderId;
	private int orderDate;
	private String orderDay;
	private String orderDescription;
	
	public Order() {
		this.orderId = 0;
		this.orderDate = 0;
		this.orderDay = "  ";
		this.orderDescription = "  ";
	}
	public Order(int orderId, int orderDate, String orderDay, String orderDescription) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderDay = orderDay;
		this.orderDescription = orderDescription;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderDay() {
		return orderDay;
	}
	public void setOrderDay(String orderDay) {
		this.orderDay = orderDay;
	}
	public String getOrderDescription() {
		return orderDescription;
	}
	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}
	
	public void confirmOrder() {
		
	}
	public void cancelOrder() {
		
	}
	public void placeOrder() {
		
	}
	
	public String showOrderDetails() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderDay=" + orderDay
				+ ", orderDescription=" + orderDescription + "]";
	}
	
	
	

}
