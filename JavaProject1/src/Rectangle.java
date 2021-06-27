
public class Rectangle extends Polygon {
	@Override
	public void calcArea(double length, double breadth) {
		System.out.println("Rectangle class");
		area = length * breadth;
	}
	
	public void printInfo(){
		System.out.println("This method is added in Reactangle class");
	}
}
