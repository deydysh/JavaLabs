package ru.mirea.lab3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft.x = x1;
        topLeft.y = y1;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;

        bottomRight.x = x2;
        bottomRight.y = y2;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public boolean isCorrectRectangle () {
        if ((topLeft.xSpeed == bottomRight.xSpeed) & (topLeft.ySpeed == bottomRight.ySpeed))
            return true;
        else return false;
    }

    @Override
    public void moveUp() {
        if(isCorrectRectangle()) {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
    }

    @Override
    public void moveDown() {
        if(isCorrectRectangle()) {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
    }

    @Override
    public void moveLeft() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveRight() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft: " + topLeft +
                ", bottomRight: " + bottomRight +
                '}';
    }
}
