// Movable Point class
// Group 5

public class MovablePoint extends Movable {
    // default -> classes in the same package can access these variables directly
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // constructs a movable point with the given x and y coordinates and x and y speeds
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // returms a string that describes the point's coordinate
    public String toString() {
        return "Point at x = " + this.x + " and y = " + this.y;
    }

    // moves the point up
    public void moveUp() {
        this.y -= ySpeed;
    } 

    // moves the point down
    public void moveDown() {
        this.y += ySpeed;
    }

    // moves the point left
    public void moveLeft() {
        this.x -= xSpeed;
    }

    // moves the point right
    public void moveRight() {
        this.x += xSpeed;
    }
}