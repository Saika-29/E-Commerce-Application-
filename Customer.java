package ecommerce;

public class Customer {
	
	private int custId;
	private String custName;
	private String custEmail;
	private String custPassword;
	private String CustAddress;
	private int phoneNo;
	public Customer() {
		this.custId = 0;
		this.custName = "  ";
		this.custEmail = "  ";
		this.custPassword = "  ";
		this.CustAddress = "  ";
		this.phoneNo = 0;
	}
	public Customer(int custId, String custName, String custEmail, String custPassword, String custAddress, int phoneNo) {
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.custPassword = custPassword;
		this.CustAddress = custAddress;
		this.phoneNo = phoneNo;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public String getCustAddress() {
		return CustAddress;
	}
	public void setCustAddress(String custAddress) {
		CustAddress = custAddress;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String showCustomerDetails() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail + ", custPassword="
				+ custPassword + ", CustAddress=" + CustAddress + ", phoneNo=" + phoneNo + "]";
	}
	
	

}
