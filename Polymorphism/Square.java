// Square class
// Group 5

public class Square extends Rectangle {

   public Square() {
      this(1.0, 1.0 "green", true);
   }
   
   public Square(double side) {
      super(side, side);
   }
   
   public Square(double side, String color, boolean filled) {
      super(side, side, color, filled);
   }
   
   public double getSide() {
      return this.side;
   }
   
   public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
   
  public String toString() {
		return "A square with side " + getSide() + ", which is a subclass of " + super.toString();
	}	
}