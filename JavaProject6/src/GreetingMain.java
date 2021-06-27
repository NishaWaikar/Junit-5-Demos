
public class GreetingMain {
	public static void main(String[] args) {
//		Greeting gm = () -> System.out.println("Good Morning");
//		Greeting gn = () -> System.out.println("Good Evening");
//		Greeting hello = () -> System.out.println("Hello World");
//		
//		gm.greet();
//		gn.greet();
//		hello.greet();
		
//		Greeting gm = (String name) -> System.out.println("Good Morning " + name);
//		Greeting gn = (String s) -> System.out.println("Good Evening " + s);
//		Greeting hello = (str) -> System.out.println("Hello " + str);
//		
//		gm.greet("John");
//		gn.greet("John");
//		hello.greet("John");
		
//		Greeting gm = () -> "Good Morning";
//		Greeting gn = () -> "Good Evening";
//		Greeting hello = () -> {return "Hello World";};
//		
//		System.out.println(gm.greet());
//		System.out.println(gn.greet());
//		System.out.println(hello.greet());
		
		Greeting gm = (name) -> "Good Morning " + name;
		Greeting gn = (String name) -> "Good Evening " + name;
		Greeting hello = (str) -> {return "Hello " + str;};
		
		System.out.println(gm.greet("John"));
		System.out.println(gn.greet("John"));
		System.out.println(hello.greet("John"));
		
	}
}
