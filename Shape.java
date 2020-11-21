// Shape class
// Group 5

public class Shape {
   private String color;
   private boolean filled;
   
   // constructs a default green and filled shape
   public Shape() {
      this("green", true);
   }
   
   // constructs a shape with the given color, and filled if given boolean is true
   public Shape(String color, boolean filled) {
      this.color = color;
      this.filled = filled;
   }
  
   // returns the color of this shape
   public String getColor() {
      return this.color;
   }
   
   // sets the color of this shape to the given color
   public void setColor(String color) {
      this.color = color;
   }
   
   // returns true if this shape is filled, false otherwise
   public boolean isFilled() {
      return this.filled;
   }
   
   // fills the shape if given boolean is true, and unfills the shape if given boolean is false
   public void setFilled(boolean filled) {
      this.filled = filled;
   }
   
   // returns a string describing the shape
   public String toString() {
      String isFilled = "filled";
      if (!filled) {
         isFilled = "Not Filled";
      }
      return "A Shape with color of " + this.color + " and " + isFilled; 
   }
}