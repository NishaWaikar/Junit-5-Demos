
public class PolygonMain {
	public static void main(String[] args) {
		Polygon polygon; // reference of class Polygon
		
//		polygon = new Polygon();
//		polygon.calcArea(12.34, 8.5);
//		polygon.displayArea();
		
		polygon = new Rectangle(); //upcasting
		polygon.calcArea(12.34, 8.5);
		polygon.displayArea();
		Rectangle rectangle = (Rectangle) polygon; //downcasting
		rectangle.printInfo();
		
		polygon = new Triangle();  // upcasting
		polygon.calcArea(12.34, 8.5);
		polygon.displayArea();
	}
}
