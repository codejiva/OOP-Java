package case_3;

/**
 * MovableTest
 */
public class MovableTest {

    public static void main(String[] args) {
        Movable[] movables = new Movable[2];

        movables[0] = new MovablePoint(3, 5, 4, 3);
        movables[1] = new MovableCircle(2, 3, 3, 7, 6);
        System.out.println("Position (point): " + movables[0].toString());
        System.out.println("Position (circle): " + movables[1].toString());

        movables[0].moveDown();
        movables[0].moveLeft();
        movables[0].moveLeft();
        movables[0].moveUp();

        movables[1].moveDown();
        movables[1].moveLeft();
        movables[1].moveLeft();
        movables[1].moveUp();

        System.out.println("New position (point): " + movables[0].toString());
        System.out.println("New position (circle): " + movables[1].toString());
    }
}
