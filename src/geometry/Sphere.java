/**
 * 
 */
package geometry;

/**
 * @author Mike Dietz
 *
 */
abstract class Sphere implements _3D {
	
	private static double radius = 0;
	
	public static double getRadius() {
		
		return radius;
	}
	public static void setRadius(int radius2) {
		Sphere.radius = radius2;
	}
	public static double calcVolume() {
		
		double r = getRadius();
		double volume = (4*22*r*r*r)/(3*7);
		return volume;
	}
}
