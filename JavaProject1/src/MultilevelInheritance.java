class A{
	public A() {
		super();
		System.out.println("Class A");
	}
}

class B extends A{
	public B() {
		super();
		System.out.println("Class B");
	}
}

class C extends B{
	public C() {
		super();
		System.out.println("Class C");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		C c = new C();
	}
}
