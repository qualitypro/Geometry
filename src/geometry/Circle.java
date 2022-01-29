/**
 * Abstract Class Circle implementing the _2D interface
 */
package geometry;

/**
 * @author Mike Dietz
 *
 */
abstract class Circle implements _2D {
	
	//encapsulate the data
	private static double radius = 0;
	
	public static double getRadius() {
		return radius;
	}
	public static void setRadius(double radius2) {
		Circle.radius = radius2;
	}
	
	public static double calcArea() {
				
		double r = getRadius();
		double area = (double)((22*r*r)/7);
		return area;
		
	}

}
