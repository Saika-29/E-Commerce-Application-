package ecommerce;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Product p1=new Product();
		int pId=sc.nextInt();
		String pName=sc.next();
		String pDescription=sc.next();
		int pQuantity=sc.nextInt();
		double pUnitPrice=sc.nextDouble();
		Product p2=new Product(pId,pName,pDescription,pQuantity,pUnitPrice);
		System.out.println(p1.showProductDetails());
		System.out.println(p2.showProductDetails());
		
		Customer c1=new Customer();
		int custId=sc.nextInt();
		String custName=sc.next();
		String custEmail=sc.next();
		String custPassword=sc.next();
		String custAddress=sc.next();
		int phoneNo=sc.nextInt();
		Customer c2=new Customer(custId,custName,custEmail,custPassword,custAddress,phoneNo);
		System.out.println(c1.showCustomerDetails());
		System.out.println(c2.showCustomerDetails());
		
		Item i1=new Item();
		int itemId=sc.nextInt();
		String itemName=sc.next();
		int itemQuantity=sc.nextInt();
		String categoryOfItem=sc.next();
		Item i2=new Item(itemId,itemName,itemQuantity,categoryOfItem);
		System.out.println(i1.showItemDetails());
		System.out.println(i2.showItemDetails());
		
		ShoppingCart sc1=new ShoppingCart();
		ShoppingCart sc2=new ShoppingCart(pId,pName,pDescription,pQuantity,pUnitPrice);
		System.out.println(sc1.viewCartDetails());
		System.out.println(sc2.viewCartDetails());
		
		Order o1=new Order();
		int orderId=sc.nextInt();
		int orderDate=sc.nextInt();
		String orderDay=sc.next();
		String orderDescription=sc.next();
		Order o2=new Order(orderId,orderDate,orderDay,orderDescription);
		System.out.println(o1.showOrderDetails());
		System.out.println(o2.showOrderDetails());
		
		ProductController pc1=new ProductController();
		int productId=sc.nextInt();
		int quantityOfProducts=sc.nextInt();
		String productCategory=sc.next();
		ProductController pc2=new ProductController(productId,quantityOfProducts,productCategory);
		System.out.println(pc1.toString());
		System.out.println(pc2.toString());
		
		ShoppingCartController scc1=new ShoppingCartController();
		ShoppingCartController scc2=new ShoppingCartController(pId,pName,pDescription,pQuantity,pUnitPrice);
		System.out.println(scc1.getCartDetails());
		System.out.println(scc2.getCartDetails());
		
	}

	

}
