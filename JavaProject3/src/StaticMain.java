
public class StaticMain {
	public static void main(String[] args) {
		StaticVariableDemo demo = new StaticVariableDemo();
		demo.intVar1 = 10;
		demo.instanceMethod();
		
		StaticVariableDemo.intStaticVar1 = 20;
		StaticVariableDemo.staticMethod();
	}
}
