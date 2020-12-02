// Circle class
// Group 5

public class Rectangle extends Shape {
   private double width;
   private double length;
   
   public Rectangle() {
      this(1.0, 1.0 "green", true);
   }
   
   public Rectangle(double width, double length) {
      this(width, length, "green", true);
   }
   
   public Rectangle(double width, double length, String color, boolean filled) {
      super(color, filled);
      this.width = width;
      this.length = length;
   }
   
   public double getWidth() {
      return this.width;
   }
   
   public void setWidth(double width) {
      this.width = width;
   }
   
   public double getLength() {
      return this.length;
   }

    public void setLength(double length) {
      this.length = length;
   }
   
   public double getPerimeter() {
      return (this.length + this.width) * 2.0;
   }
   
   public double getArea() {
		return width * length;
	}


   public String toString() {
      return "A Rectangle with width=" + this.width + " and length=" + this.length + ", which is a subclass of " + super.toString();
   }
}