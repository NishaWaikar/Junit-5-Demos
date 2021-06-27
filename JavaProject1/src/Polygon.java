
public abstract class Polygon {
	double area;
	
	public abstract void calcArea(double length, double breadth);
	
	public void displayArea() {
		System.out.println("Area is: " + area);
	}
}
