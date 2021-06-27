
public class AnimalMain {
	public static void main(String[] args) {
		Animal animal;
		
		animal = new Cat();
		animal.eat();
		animal.speak();
		
		animal = new Dog();
		animal.eat();
		animal.speak();
	}
}
