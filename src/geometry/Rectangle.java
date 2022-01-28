package geometry;

/**
 * @author arch
 *
 */
abstract class Rectangle implements _2D {
	private static double base = 0;	
	private static double height = 0;
	public static double getHeight() {
		return height;
	}
	public static void setHeight(double height2) {
		Rectangle.height = height2;
	}
	public static double getBase() {
		return base;
	}
	public static void setBase(double base2) {
		Rectangle.base = base2;
	}
	public static double calcArea() {
		double area = ((getBase() * getHeight()));
		return area;
	}
}