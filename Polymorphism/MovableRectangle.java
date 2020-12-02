// Movable Rectangle class
// Group 5

public class MovableRectangle extends Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    // constructs movable rectangle for given coordinates for top left and bottom right points. 
    // (x1, y1) for top left. (y1, y2) for bottom right
    // sets the speed it moves as the given x and y speeds
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // returns a string that describes the Rectangle 
    public String toString() {
        return "A moveable Rectangle with its top left at a " + topLeft.toString() + " and its bottom right at a " + bottomRight.toString(); 
    }

    // moves the object up
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    // moves the object down
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
        
    // moves object Left
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    
    // moves object Right
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}