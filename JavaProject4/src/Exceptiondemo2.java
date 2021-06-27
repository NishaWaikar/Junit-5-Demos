
public class Exceptiondemo2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c;
		try {
			c = a/b;
			System.out.println("c is: " + c);
			String str = "Hello";
			System.out.println(str.charAt(2));
			Object obj = null;
			obj.hashCode();
		} catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally block");
		}
	}
}
