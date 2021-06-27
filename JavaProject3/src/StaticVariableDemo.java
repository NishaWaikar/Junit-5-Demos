
public class StaticVariableDemo {
	int intVar1; // instance or non static data member
	static int intStaticVar1; // class or static data member
	// initialize both intVar1 & intStaticVar1 in both the method
	public void instanceMethod() {
		System.out.println("instance method that is invoked using instance of class");
		intVar1 = 10;
		intStaticVar1 = 20;
	}
	
	public static void staticMethod() {
		System.out.println("static method that is invoked using name of class");
		StaticVariableDemo demo = new StaticVariableDemo();
		demo.intVar1 = 10;
		intStaticVar1 = 20;
	}
}
