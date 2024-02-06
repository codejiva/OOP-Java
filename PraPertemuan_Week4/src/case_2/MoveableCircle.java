package case_2;

public class MoveableCircle implements Moveable {
    private int radius;
    private MoveablePoint center;

    MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MoveablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return center.toString() + ", radius=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
