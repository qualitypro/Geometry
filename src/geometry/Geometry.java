/**
 * A geometry package containing a Geometry class.
 * 
 */
package geometry;

/**
 * @author Mike Dietz
 *
 */
public class Geometry {

	/**
	 * Geometry Constructor(){}
	 */
	public Geometry() {

	 
	}
	
	/*
	 * Example of Abstraction to enforce business rules
	 * 
	 * */
	public abstract class TriangleA extends Triangle{
		
	}
	
	public abstract class SquareA extends Square{
		
	}	
	
	public abstract class RectangleA extends Rectangle{
		
	}		
	
	public abstract class CircleA extends Circle{

	}	
	
	public abstract class SphereA extends Sphere{
			
	}
	
	public abstract class CubeA extends Cube{
		
	}
	
	public abstract class PyramidA extends Pyramid{
		
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TriangleA.setBase(128);
		TriangleA.setHeight(128);
		System.out.print("Triangle Area => "+TriangleA.calcArea()+" squared\n");

		SquareA.setBase(128);
		System.out.print("Square Area => "+SquareA.calcArea()+" squared\n");
		
		RectangleA.setBase(128);
		RectangleA.setHeight(256);
		System.out.print("Rectangle Area => "+RectangleA.calcArea()+" squared\n");

		CircleA.setRadius(256);
		System.out.print("Circle Volume => "+CircleA.calcArea()+" squared\n");

		SphereA.setRadius(128);
		System.out.print("Sphere Volume => "+SphereA.calcVolume()+" cubed\n");
		
		CubeA.setLength(128);
		System.out.print("Cube Volume => "+CubeA.calcVolume()+" cubed\n");
		
		PyramidA.setBase(128);
		PyramidA.setHeight(128);
		PyramidA.setLength(256);
		System.out.print("Pyramid Volume => "+PyramidA.calcVolume()+" cubed\n");
	}

}
