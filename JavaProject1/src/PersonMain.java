
public class PersonMain {
	public static void main(String[] args) {
		Address address = new Address("1", "ABC", "ABC", "ABC", "ABC", "12345");
		System.out.println(address);
		
		address.setFlatNo("2");
		System.out.println(address);
		
		Student student = new Student(1, 10, "Seeta", 15, address);
		System.out.println(student);
	}
}
