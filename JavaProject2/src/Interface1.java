
public interface Interface1 {
	int VALUE = 10;
	public void method1() ;
	public void method2() ;
	public default void method5() {
		System.out.println("Method5");
	}
	public static void method6() {
		System.out.println("Method6");
	}
}
