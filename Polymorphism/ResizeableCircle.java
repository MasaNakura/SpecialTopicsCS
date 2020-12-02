package polymorphism;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
		
	}
	
	public String toString() {
		return "Resized Circle with radius: " + getRadius();
		
	}
	
	public void resize(int percent) {
		double n = getRadius()+ (getRadius()*percent/100);
		setRadius(n);
	}
}