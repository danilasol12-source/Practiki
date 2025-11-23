//Задание 2-3 (3 - строки 12, 16)

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + "}";
    }

    public boolean SameSpeed(){
        return (topLeft.getxSpeed() == bottomRight.getxSpeed()) && (topLeft.getySpeed() == bottomRight.getySpeed());
    }

    @Override
    public void moveUp(){
        if (SameSpeed()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown(){
        if (SameSpeed()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft(){
        if (SameSpeed()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight(){
        if (SameSpeed()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}