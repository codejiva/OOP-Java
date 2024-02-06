package case_2;

public class MoveableTest {

    public static void main(String[] args) {
        Moveable[] movables = new Moveable[2];

        movables[0] = new MoveablePoint(4, 6, 3, 4);
        movables[1] = new MoveableCircle(3, 2, 2, 4, 6);
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
