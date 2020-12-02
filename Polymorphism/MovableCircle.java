// Movable Circle class
// Group 5

public class MovableCircle extends Movable {
    private int radius;
    private MovablePoint center;
    
    // constructs movable circle with radius of 1.0, color of green, and is filled
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // returns a string that describes the circle's radius and center coordinates 
    public String toString() {
        return "A moveable circle with radius of " + radius + " and a center of " + center.toString(); 
    }

    // moves the circle up
    public void moveUp() {
        center.moveUp();
    }

    // moves the circle down
    public void moveDown() {
        center.moveDown();
    }
        
    // moves circle Left
    public void moveLeft() {
        center.moveLeft();
    }
    
    // moves circle Right
    public void moveRight() {
        center.moveRight();
    }
}