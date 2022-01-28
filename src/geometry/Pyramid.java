/**
 * 
 */
package geometry;

/**
 * @author arch
 *
 */
abstract class Pyramid implements _3D {
	
	private static double base = 0;	
	private static double length = 0;
	private static double height = 0;

	public static double getBase() {
		return base;
	}
	public static void setBase(int base2) {
		Pyramid.base = base2;
	}

	public static double getLength() {
		return length;
	}
	public static void setLength(double length2) {
		Pyramid.length = length2;
	}
	
	public static double getHeight() {
		
		return height;
	}
	public static void setHeight(double height2) {
		Pyramid.height = height2;
	}
	public static double calcVolume() {
		
		double volume = ((getBase()*getLength())*getHeight())/3;
		return volume;
	}
}