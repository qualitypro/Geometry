/**
 * Abstract Class Cube implementing the _3D interface
 */
package geometry;

/**
 * @author Mike Dietz
 *
 */
abstract class Cube implements _3D {
	
	//encapsulate the data
	private static double length = 0;
	
	
	public static double getLength() {
		
		return length;
	}
	public static void setLength(double length2) {
		Cube.length = length2;
	}
	
	public static double calcVolume() {
		
		double l = getLength();
		double volume = (double)((l*l*l));
		return volume;
	}
}
