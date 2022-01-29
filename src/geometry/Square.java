/**
 * Abstract Class Square implementing the _2D interface
 */
package geometry;

/**
 * @author Mike Dietz
 *
 */
abstract class Square implements _2D {
	
	//encapsulate the data
	private static double base = 0;	

	public static double getBase() {
		return base;
	}
	public static void setBase(double base2) {
		Square.base = base2;
	}
	public static double calcArea() {
		double area = ((getBase() * getBase()));
		return area;
	}
}
