
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c;
		try {
			//open resource
			c = a/b;
			System.out.println("c is: " + c);
			// usage of resource
			String str = "Hello";
			System.out.println(str.charAt(2));
			
		} catch(ArithmeticException e) {
			System.out.println("value of b can not be 0");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid String index");
		} finally {
			System.out.println("Finally block");
			//close the resource
		}
	}
}