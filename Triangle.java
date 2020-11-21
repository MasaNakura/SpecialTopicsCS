// Triangle Class - extra subclass for shape
public class Triangle extends Shape{
   private boolean isRight;
   private double width;
   private double length;
   
   // sets a right triangle with width and length of 1
   public Triangle() {
      this(1.0, 1.0, true);
   }
   
   // sets a triangle with given length and with, and given boolean indicates a right traingle if true
   public Triangle(double width, double length, boolean isRight) {
      this.width = width;
      this.length = length;
      this.isRight = isRight;
   }
   
   // sets the length to the given length   
   public void setLength(double length) {
      this.length = length;
   }
   
   // returns the length
   public double getLength() {
      return this.length;
   }
   
   // sets the width to given width
   public void setWidth(double width) {
      this.width = width;
   }
   
   // returns width
   public double getWidth() {
      return this.width;
   }
   
   // true if triangle is right triangle, false otherwise
   public boolean isRight() {
      return this.isRight;
   }
   
   // if given boolean is true, sets this triangle as a right triable
   // and if false, makes the triangle not a right triangle
   public void setRight(boolean isRight) {
      this.isRight = isRight;
   }
   
   public double getArea() {
      return 0.5 * length * width;
   }
   
   public double getPerimeter() {
      return length + width + Math.sqrt((length * length + width * width));
   }
   
   public String toString() {
      return "A Triangle with length=" + this.length + ", and width=" + this.width +", which is a subclass of " + super.toString();
   }
}