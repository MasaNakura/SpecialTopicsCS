// Triangle Class - extra subclass for shape
public class Triangle extends Shape{
   private boolean isRight;
   private double width;
   private double length;
   
   public Triangle() {
      this(1.0, 1.0, true);
   }
   
   public Triangle(double width, double length, boolean isRight) {
      this.width = width;
      this.length = length;
      this.isRight = isRight;
   }
   
   public void setLength(double length) {
      this.length = length;
   }
   
   public double getLength() {
      return this.length;
   }
   
   public void setWidth(double width) {
      this.width = width;
   }
   
   public double getWidth() {
      return this.width;
   }
   
   public boolean isRight() {
      return this.isRight;
   }
   
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