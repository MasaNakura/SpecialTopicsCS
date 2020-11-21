// Circle class
// Group 5

public class Circle extends Shape {
   private double radius;
   
   // constructs default circle with radius of 1.0, color of green, and is filled
   public Circle() {
      this(1.0, "green", true);
   }
   
   // constructs a green filled circle with the given radius
   public Circle(double radius) {
      this(radius, "green", true);
   }
   
   // constructs a circle with the given radius and color, and if it is filled or not
   // depending on the given boolean. 
   public Circle(double radius, String color, boolean filled) {
      super(color, filled);
      this.radius = radius;
   }
   
   // returns the circle's radius
   public double getRadius() {
      return this.radius;
   }
   
   // sets the radius to the given radius
   public void setRadius(double radius) {
      this.radius = radius;
   }
   
   // returns the area of the circle
   public double getArea() {
      return Math.PI * this.radius * this.radius;
   }
   
   // returns the perimeter of the circle
   public double getPerimeter() {
      return Math.PI * this.radius * 2.0;
   }
   
   // returns a string that describes the circle
   public String toString() {
      return "A Circle with radius=" + this.radius + ", which is a subclass of " + super.toString();
   }
}