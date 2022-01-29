/**
 * Abstract Class Triangle implementing the _2D interface
 */
package geometry;

/**
 * @author Mike Dietz
 *
 */
abstract class Triangle implements _2D  {
	
	//encapsulate the data
	private static double base = 0;	
	private static double height = 0;
	public static double getHeight() {
		return height;
	}
	public static void setHeight(double height2) {
		Triangle.height = height2;
	}
	public static double getBase() {
		return base;
	}
	public static void setBase(double base2) {
		Triangle.base = base2;
	}
	public static double calcArea() {
		double area = (double)((getBase() * getHeight())/2);
		return area;
	}
	
}
