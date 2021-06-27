
public class Customer {
	private static int customerId;
	private String customerName;
	private String customerAddress;
	
	public Customer(String customerName, String customerAddress) {
		customerId++;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public void displayCustomer(Customer customer) {
		System.out.println(customer);
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	public void welcomeCustomer() {
		System.out.println("Welcome to my website");
	}
}
