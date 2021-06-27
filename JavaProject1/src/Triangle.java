
public class Triangle extends Polygon{
	@Override
	public void calcArea(double length, double breadth) {
		System.out.println("Triangle class");
		area = length * breadth * 0.5;
	}
}
