
public class CustomerMain {
	private int var1;
	public static void main(String[] args) {
		CustomerMain customerMain = new CustomerMain();
		customerMain.var1 = 10;
		Customer customer1 = new Customer("Ramlal", "Pune");
		System.out.println(customer1);
		
		Customer customer2 = new Customer("Shamlal", "Mumbai");
		System.out.println(customer2);
		
		Customer customer3 = new Customer("Seeta", "Pune");
		System.out.println(customer3);
		
		Customer customer4 = new Customer("Geeta", "Mumbai");
		System.out.println(customer4);
	}
}
