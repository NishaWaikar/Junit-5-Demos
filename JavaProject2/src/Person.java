
public class Person {
	private String name;
	private String address;
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}
}
